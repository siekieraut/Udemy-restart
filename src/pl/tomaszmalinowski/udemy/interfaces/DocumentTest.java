package pl.tomaszmalinowski.udemy.interfaces;

public class DocumentTest {


    public static void main(String[] args) {

        TxtDocument txt = new TxtDocument();
        DrawDokument draw = new DrawDokument();


        System.out.println(txt.open("txtPath"));
        System.out.println(draw.save());

        draw.introduceYorself();

        Document calc = new Document() {
            @Override
            public boolean save() {
                return false;
            }

            @Override
            public String open(String path) {
                return null;
            }
        };

        //onClickListener

        draw.draw(new OnClickListener() {
            @Override
            public void onClick() {

            }
        });

    }
}
