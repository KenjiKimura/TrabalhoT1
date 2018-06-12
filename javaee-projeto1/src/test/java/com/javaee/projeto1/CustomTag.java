package com.javaee.projeto1;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CustomTag extends SimpleTagSupport {
	
		private String text;
		public String getText() {
			return text;
		}


		public void setText(String text) {
			this.text = text;
		}


		public String getColor() {
			return color;
		}


		public void setColor(String color) {
			this.color = color;
		}


		private String color;
		
	
		@Override
		public void doTag() throws JspException, IOException {
			StringBuilder sb = new StringBuilder();
			
			sb.append("<label ").append("style='").append("color:")
			.append(color).append("'>").append(text).append("</label>");
			sb.append("<label>Univel</label>");
			
			getJspContext().getOut().write(sb.toString());
		}

}
