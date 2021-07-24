package com.epam.javaIntro.textFile;

public class TextFile extends File {
	private Content content;
	
	private TextFile(String name, Directory directory) {
		super(name, directory);
		content = new Content("");
	}

	public static TextFile create(String name, Directory directory) {
		TextFile textFile = new TextFile(name, directory);
		return textFile;
	}
	
	public void printContent() {
		System.out.println(content.toString());
	}
	
	public void addText(String text) {
		content.addText(text);
	}
	
	public void deleteText(String text) {
		content.deleteText(text);
	}
	
	public String getText() {
		return content.getText();
	}
	
	public Content getContent() {
		return content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return String.format("Название текстового файла: %s", super.getName());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TextFile other = (TextFile) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		return true;
	}
}
