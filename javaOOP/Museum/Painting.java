public class Painting extends Art {
	private String paintType;
	
	
	public Painting(String paintType, String title, String author, String description) {
		this.paintType = paintType;
		this.setTitle(title);
		this.setAuthor(author);
		this.setDescription(description);
		
	}
	public String getPaintType() {
		return paintType;
	}
	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}
	@Override
	public void viewArt() {
		// TODO Auto-generated method stub

	}

}
