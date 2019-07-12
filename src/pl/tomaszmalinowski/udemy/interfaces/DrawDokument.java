package pl.tomaszmalinowski.udemy.interfaces;

public class DrawDokument implements Document {
    @Override
    public boolean save() {
        System.out.println("Save Daraw Doc.");
        return true;
    }

    @Override
    public String open(String path) {
        return "draw file:" + path;
    }

    public void draw (OnClickListener ocl) {
        System.out.println("draw...");

    }
}
