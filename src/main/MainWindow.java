package main;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileNameExtensionFilter;

import util.Configuration;
import ast.ASTBuilder;
import code.CodeGenerator;
import code.DelphiGenerator;
import code.DelphiGeneratorDAO;
import code.JavaGenerator;
import code.JavaGeneratorDAO;
import code.PHPGeneratorDB;
import code.PHPGeneratorFluentPDO;

import javax.swing.SwingConstants;

public class MainWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 309146006810341944L;
	private JPanel contentPane;
	private JTextField textFieldArquivo;
	private JList<String> listLog;
	private JButton btnExecutar;
	private JLabel labelArquivoMsg;
	private JRadioButton rdbtnPhp;
	private JRadioButton rdbtnDelphi;
	private Configuration configuration;
	private JTextField textFieldPastaSaida;
	private JCheckBox chckbxGerarDao;
	private JLabel labelPastaSaidaMsg;
	private JLabel labelPastaSaidaMsgDAO;
	private JTextField textFieldPrefixo;
	private JTextField textFieldSufixo;
	private JTextField textFieldPastaSaidaDAO;
	private JTextField textFieldPrefixoDAO;
	private JTextField textFieldSufixoDAO;
	private JCheckBox chckbxUsarFluentPDO;
	private JRadioButton rdbtnJava;
	private JTextField textFieldPacote;
	private JTextField textFieldPacoteDAO;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		configuration = new Configuration();
		setResizable(false);
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e1) {
			e1.printStackTrace();
		}
		setTitle("SQL to Class");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 698);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldArquivo = new JTextField();
		textFieldArquivo.setBounds(61, 16, 456, 20);
		contentPane.add(textFieldArquivo);
		textFieldArquivo.setColumns(10);
		textFieldArquivo.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent arg0) {
				changedArquivo();
			}
			
			@Override
			public void insertUpdate(DocumentEvent arg0) {
				changedArquivo();
			}
			
			@Override
			public void changedUpdate(DocumentEvent arg0) {
				changedArquivo();
			}
		});
		
		JLabel lblArquivo = new JLabel("Arquivo:");
		lblArquivo.setBounds(10, 19, 41, 14);
		contentPane.add(lblArquivo);
		
		JButton btnAbrirArquivo = new JButton("Abrir...");
		btnAbrirArquivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actionAbrirArquivo();
			}
		});
		btnAbrirArquivo.setBounds(527, 10, 82, 32);
		contentPane.add(btnAbrirArquivo);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Linguagem", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 62, 104, 91);
		contentPane.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		rdbtnPhp = new JRadioButton("PHP");
		rdbtnPhp.setSelected(true);
		panel.add(rdbtnPhp);
		rdbtnDelphi = new JRadioButton("Delphi");
		panel.add(rdbtnDelphi);
		rdbtnJava = new JRadioButton("Java");
		panel.add(rdbtnJava);
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnPhp);
		buttonGroup.add(rdbtnDelphi);
		buttonGroup.add(rdbtnJava);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 304, 609, 355);
		contentPane.add(scrollPane);
		
		listLog = new JList<String>();
		listLog.setModel(new DefaultListModel<String>());
		scrollPane.setViewportView(listLog);
		
		btnExecutar = new JButton("Executar");
		btnExecutar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionExecutar();
			}
		});
		btnExecutar.setEnabled(false);
		btnExecutar.setBounds(537, 266, 82, 27);
		contentPane.add(btnExecutar);
		
		JLabel lblLog = new JLabel("Log:");
		lblLog.setBounds(10, 279, 46, 14);
		contentPane.add(lblLog);
		
		labelArquivoMsg = new JLabel("");
		labelArquivoMsg.setForeground(Color.RED);
		labelArquivoMsg.setBounds(61, 37, 456, 14);
		contentPane.add(labelArquivoMsg);
		setLocationRelativeTo(null);
		
		chckbxGerarDao = new JCheckBox("Gerar DAO");
		chckbxGerarDao.setBounds(10, 160, 97, 23);
		contentPane.add(chckbxGerarDao);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Classes", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(124, 62, 495, 91);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("Pasta de saida:");
		label.setBounds(10, 23, 74, 14);
		panel_1.add(label);
		
		textFieldPastaSaida = new JTextField();
		textFieldPastaSaida.setBounds(89, 20, 306, 20);
		textFieldPastaSaida.setText((String) null);
		textFieldPastaSaida.setColumns(10);
		panel_1.add(textFieldPastaSaida);
		textFieldPastaSaida.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent arg0) {
				changedPastaSaida();
			}
			
			@Override
			public void insertUpdate(DocumentEvent arg0) {
				changedPastaSaida();
			}
			
			@Override
			public void changedUpdate(DocumentEvent arg0) {
				changedPastaSaida();
			}
		});
		
		JLabel label_1 = new JLabel("Prefixo");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(49, 63, 34, 14);
		panel_1.add(label_1);
		
		textFieldPrefixo = new JTextField();
		textFieldPrefixo.setBounds(88, 60, 86, 20);
		textFieldPrefixo.setText((String) null);
		textFieldPrefixo.setColumns(10);
		panel_1.add(textFieldPrefixo);
		
		textFieldSufixo = new JTextField();
		textFieldSufixo.setBounds(239, 60, 86, 20);
		textFieldSufixo.setText((String) null);
		textFieldSufixo.setColumns(10);
		panel_1.add(textFieldSufixo);
		
		JLabel label_2 = new JLabel("Sufixo");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(201, 63, 30, 14);
		panel_1.add(label_2);
		
		JButton btnAbrirPasta = new JButton("Abrir...");
		btnAbrirPasta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionAbrirPasta();
			}
		});
		btnAbrirPasta.setBounds(405, 14, 80, 32);
		panel_1.add(btnAbrirPasta);
		
		labelPastaSaidaMsg = new JLabel("");
		labelPastaSaidaMsg.setForeground(Color.RED);
		labelPastaSaidaMsg.setBounds(89, 37, 306, 14);
		panel_1.add(labelPastaSaidaMsg);
		
		JLabel lblPacote = new JLabel("Pacote");
		lblPacote.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPacote.setBounds(349, 63, 42, 14);
		panel_1.add(lblPacote);
		
		textFieldPacote = new JTextField();
		textFieldPacote.setText((String) null);
		textFieldPacote.setColumns(10);
		textFieldPacote.setBounds(399, 60, 86, 20);
		panel_1.add(textFieldPacote);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Classes de acesso a base de dados (DAO)", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(124, 164, 495, 91);
		contentPane.add(panel_2);
		
		JLabel label_3 = new JLabel("Pasta de saida:");
		label_3.setBounds(10, 23, 74, 14);
		panel_2.add(label_3);
		
		textFieldPastaSaidaDAO = new JTextField();
		textFieldPastaSaidaDAO.setText((String) null);
		textFieldPastaSaidaDAO.setColumns(10);
		textFieldPastaSaidaDAO.setBounds(89, 20, 306, 20);
		panel_2.add(textFieldPastaSaidaDAO);
		
		JLabel label_4 = new JLabel("Prefixo");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(49, 63, 34, 14);
		panel_2.add(label_4);
		
		textFieldPrefixoDAO = new JTextField();
		textFieldPrefixoDAO.setText((String) null);
		textFieldPrefixoDAO.setColumns(10);
		textFieldPrefixoDAO.setBounds(88, 60, 86, 20);
		panel_2.add(textFieldPrefixoDAO);
		
		textFieldSufixoDAO = new JTextField();
		textFieldSufixoDAO.setText((String) null);
		textFieldSufixoDAO.setColumns(10);
		textFieldSufixoDAO.setBounds(239, 60, 86, 20);
		panel_2.add(textFieldSufixoDAO);
		
		JLabel label_5 = new JLabel("Sufixo");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setBounds(201, 63, 30, 14);
		panel_2.add(label_5);
		
		JButton btnAbrirPastaDAO = new JButton("Abrir...");
		btnAbrirPastaDAO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionAbrirPastaDAO();
			}
		});
		btnAbrirPastaDAO.setBounds(405, 14, 80, 32);
		panel_2.add(btnAbrirPastaDAO);
		
		labelPastaSaidaMsgDAO = new JLabel("");
		labelPastaSaidaMsgDAO.setForeground(Color.RED);
		labelPastaSaidaMsgDAO.setBounds(89, 37, 306, 14);
		panel_2.add(labelPastaSaidaMsgDAO);
		
		JLabel label_6 = new JLabel("Pacote");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setBounds(349, 63, 42, 14);
		panel_2.add(label_6);
		
		textFieldPacoteDAO = new JTextField();
		textFieldPacoteDAO.setText((String) null);
		textFieldPacoteDAO.setColumns(10);
		textFieldPacoteDAO.setBounds(399, 60, 86, 20);
		panel_2.add(textFieldPacoteDAO);
		
		chckbxUsarFluentPDO = new JCheckBox("Usar FluentPDO");
		chckbxUsarFluentPDO.setSelected(true);
		chckbxUsarFluentPDO.setBounds(10, 186, 104, 23);
		contentPane.add(chckbxUsarFluentPDO);
		initForm();
	}

	private void initForm() {
		File file = new File(MainWindow.class.getProtectionDomain().getCodeSource().getLocation().getPath());
		if(configuration.getFile() == null)
			configuration.setFile(file.getParent() + File.separator + "sample.sql");
		if(configuration.getPath() == null)
			configuration.setPath(file.getParent() + File.separator + "outdir");
		textFieldArquivo.setText(configuration.getFile());
		textFieldPastaSaida.setText(configuration.getPath());
		textFieldPrefixo.setText(configuration.getPrefix());
		textFieldSufixo.setText(configuration.getSuffix());
		textFieldPacote.setText(configuration.getPackageName());
		if(configuration.getGenerator() == Configuration.GENERATE_DELPHI)
			rdbtnDelphi.setSelected(true);
		else if(configuration.getGenerator() == Configuration.GENERATE_PHP)
			rdbtnPhp.setSelected(true);
		else
			rdbtnJava.setSelected(true);
		textFieldPastaSaidaDAO.setText(configuration.getPathDAO());
		textFieldPrefixoDAO.setText(configuration.getPrefixDAO());
		textFieldSufixoDAO.setText(configuration.getSuffixDAO());
		textFieldPacoteDAO.setText(configuration.getPackageNameDAO());
		chckbxGerarDao.setSelected(configuration.isGenerateDAO());
		chckbxUsarFluentPDO.setSelected(configuration.getPHPPDO() == Configuration.PHP_FLUENT_PDO);
	}

	private void optionsChanged() {
		File file = new File(textFieldArquivo.getText());
		File outDir = new File(textFieldPastaSaida.getText());
		File outDAODir = new File(textFieldPastaSaidaDAO.getText());
		boolean fileOk = file.exists() && file.isFile();
		boolean dirOk = outDir.exists() && outDir.isDirectory();
		boolean dirDAOOk = outDAODir.exists() && outDAODir.isDirectory();
		btnExecutar.setEnabled(fileOk && dirOk);
		if(fileOk)
			labelArquivoMsg.setText("");
		else
			labelArquivoMsg.setText("Arquivo inválido!");
		if(dirOk)
			labelPastaSaidaMsg.setText("");
		else
			labelPastaSaidaMsg.setText("Diretório inválido!");
		if(dirDAOOk || !chckbxGerarDao.isSelected())
			labelPastaSaidaMsg.setText("");
		else
			labelPastaSaidaMsg.setText("Diretório inválido!");
	}

	private void changedPastaSaida() {
		optionsChanged();
	}

	private void changedArquivo() {
		optionsChanged();	
	}

	private void actionExecutar() {
		ASTBuilder builder = new ASTBuilder();
		clearLog();
		if(!builder.build(textFieldArquivo.getText())) {			
			for (String	error: builder.getErrors()) {
				addLog(error);
			}
			return;
		}
		CodeGenerator gen;
		if(rdbtnDelphi.isSelected())
			gen = new DelphiGenerator(textFieldPastaSaida.getText(), builder.getScript());
		else if(rdbtnPhp.isSelected()) {
			if(chckbxUsarFluentPDO.isSelected())
				gen = new PHPGeneratorFluentPDO(textFieldPastaSaida.getText(), builder.getScript());
			else
				gen = new PHPGeneratorDB(textFieldPastaSaida.getText(), builder.getScript());
		} else {
			gen = new JavaGenerator(textFieldPastaSaida.getText(), builder.getScript());
			JavaGenerator javaGen = (JavaGenerator)gen;
			javaGen.setPackageName(textFieldPacote.getText());
		}
		gen.setClassPrefix(textFieldPrefixo.getText());
		gen.setClassSuffix(textFieldSufixo.getText());
		try {
			gen.start();
			if(chckbxGerarDao.isSelected() && !rdbtnPhp.isSelected()) {
				if(rdbtnDelphi.isSelected()) {
					DelphiGeneratorDAO genDAO = new DelphiGeneratorDAO(textFieldPastaSaidaDAO.getText(), builder.getScript());
					genDAO.setClassBasePrefix(textFieldPrefixo.getText());
					genDAO.setClassBaseSuffix(textFieldSufixo.getText());
					gen = genDAO;
				} else {
					JavaGeneratorDAO genDAO = new JavaGeneratorDAO(textFieldPastaSaidaDAO.getText(), builder.getScript());
					genDAO.setClassBasePrefix(textFieldPrefixo.getText());
					genDAO.setClassBaseSuffix(textFieldSufixo.getText());
					genDAO.setPackageBaseName(textFieldPacote.getText());
					genDAO.setPackageName(textFieldPacoteDAO.getText());
					gen = genDAO;
				}
				gen.setClassPrefix(textFieldPrefixoDAO.getText());
				gen.setClassSuffix(textFieldSufixoDAO.getText());
				gen.start();
			}
			configuration.setFile(textFieldArquivo.getText());
			configuration.setPath(textFieldPastaSaida.getText());
			configuration.setPrefix(textFieldPrefixo.getText());
			configuration.setSuffix(textFieldSufixo.getText());
			configuration.setPackageName(textFieldPacote.getText());
			if(rdbtnDelphi.isSelected())
				configuration.setGenerator(Configuration.GENERATE_DELPHI);
			else if(rdbtnPhp.isSelected())
				configuration.setGenerator(Configuration.GENERATE_PHP);
			else
				configuration.setGenerator(Configuration.GENERATE_JAVA);
			configuration.setGenerateDAO(chckbxGerarDao.isSelected());
			if(chckbxUsarFluentPDO.isSelected())
				configuration.setPHPPDO(Configuration.PHP_FLUENT_PDO);
			else
				configuration.setPHPPDO(Configuration.PHP_DB_PDO);
			configuration.setPathDAO(textFieldPastaSaidaDAO.getText());
			configuration.setPrefixDAO(textFieldPrefixoDAO.getText());
			configuration.setSuffixDAO(textFieldSufixoDAO.getText());
			configuration.setPackageNameDAO(textFieldPacoteDAO.getText());
			configuration.save();
		} catch (Exception e) {
			addLog(e.getMessage());
			e.printStackTrace();
		}
	}

	private void actionAbrirArquivo() {
		JFileChooser fileChooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Script SQL(.sql)", "sql");
		fileChooser.addChoosableFileFilter(filter);
		fileChooser.setFileFilter(filter);
		if (fileChooser.showOpenDialog(this) != JFileChooser.APPROVE_OPTION)
			return;
		File file = fileChooser.getSelectedFile();
		textFieldArquivo.setText(file.getAbsolutePath());
	}
	
	private void actionAbrirPasta() {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		if (fileChooser.showOpenDialog(this) != JFileChooser.APPROVE_OPTION)
			return;
		File file = fileChooser.getSelectedFile();
		textFieldPastaSaida.setText(file.getAbsolutePath());
	}
	
	private void actionAbrirPastaDAO() {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		if (fileChooser.showOpenDialog(this) != JFileChooser.APPROVE_OPTION)
			return;
		File file = fileChooser.getSelectedFile();
		textFieldPastaSaidaDAO.setText(file.getAbsolutePath());
	}
	
	private void clearLog() {
		DefaultListModel<String> model = (DefaultListModel<String>) listLog.getModel();
		model.clear();
	}
	
	private void addLog(String msg) {
		DefaultListModel<String> model = (DefaultListModel<String>) listLog.getModel();
		model.addElement(msg);
	}
}
