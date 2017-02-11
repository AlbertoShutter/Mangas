package com.example.alber.mangas.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    /*private static final int COUNT = 25;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }*/
    /*static {
        for (int i = 1; i <= 5; i++) {
            addItem(new DummyItem("1", "One Piece", "Eiichiro Oda", "https://myanimelist.cdn-dena.com/images/manga/3/55539.jpg"));
        }
    }
*/
    static ArrayList<HashMap<String, String>> lista = MangaListActivity.mangaList;

    static public void llenar(){
        ITEMS.clear();
        ITEM_MAP.clear();
        for(int i = 1; i <= lista.size(); i++) {
            addItem(new DummyItem(lista.get(i).get("IdManga"),lista.get(i).get("Nombre"),lista.get(i).get("Tomos"),lista.get(i).get("Editorial"),lista.get(i).get("Genero")));
        }
    }


    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }


  /*  private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }*/

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String nombre;
        public final String tomos;
        public final String editorial;
        public final String genero;
        //public final String foto;


        public DummyItem(String id, String nombre, String tomos, String editorial, String genero/*String foto*/) {
            this.id = id;
            this.nombre = nombre;
            this.tomos = tomos;
            //this.foto = foto;
            this.editorial = editorial;
            this.genero = genero;
        }

        @Override
        public String toString() {
            return nombre;
        }
    }
}
