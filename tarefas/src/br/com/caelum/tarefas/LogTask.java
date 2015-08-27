package br.com.caelum.tarefas;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

public class LogTask extends Task{

	private String level;
	private String msg;
	
	public void setLevel(String level) {
		this.level = level;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public void execute() throws BuildException {
		if("info".equals(this.level)) {
	        this.msg = "INFO: " + this.msg;
	    }

	    System.out.println(this.msg);
	}
}
