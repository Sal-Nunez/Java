public class Sculpture extends Art {
	private String material;
	
	public Sculpture(String material, String title, String author, String description) {
		this.material = material;
		this.setTitle(title);
		this.setAuthor(author);
		this.setDescription(description);
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public void viewArt() {
		// TODO Auto-generated method stub

	}

}
