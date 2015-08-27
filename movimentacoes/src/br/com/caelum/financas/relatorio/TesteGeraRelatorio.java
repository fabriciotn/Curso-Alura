package br.com.caelum.financas.relatorio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import br.com.caelum.financas.ConnectionFactory;

public class TesteGeraRelatorio {

	public static void main(String[] args) throws SQLException, JRException, FileNotFoundException {

		//JasperCompileManager.compileReportToFile("financas.jrxml"); 
		
		Connection conexao = new ConnectionFactory().getConnection();
		
		Map<String, Object> parametros = new HashMap<String, Object>();
	    Connection connexao = new ConnectionFactory().getConnection();

	    JasperPrint print = JasperFillManager.fillReport("financas.jasper", parametros, connexao);

	    JRExporter exporter = new JRHtmlExporter();
	    exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
	    exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, new FileOutputStream("financas.html"));
	    exporter.exportReport();

		conexao.close();
	}
}
