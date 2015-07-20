package vjezbe;

public class Editor extends Application {

	private TYPE type;
	private boolean freeWare;

	public Editor(String name, int yearOfRelease, double version, int size,
			TYPE type, boolean freeWare) {
		super(name, yearOfRelease, version, size);
		this.type = type;
		this.freeWare = freeWare;
	}

	public static enum TYPE {
		TEXT, PHOTO, VIDEO
	}

	@Override
	public String toString() {
		
		if (type == TYPE.PHOTO) {
			return super.toString()+"\n"+"Type of application: Photo " + " \nIs it freeware: "
					+ freeWare;
		} else if (type == TYPE.TEXT) {
			return super.toString()+"\n"+"Type of application: Text" + " \nIs it freeware: " + freeWare;
		} else {
			return super.toString()+"\n"+"Type of application: Video" + " \nIs it freeware: "
					+ freeWare;
		}
	};

}
