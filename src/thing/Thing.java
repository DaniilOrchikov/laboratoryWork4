package thing;

public class Thing{
    private final String type;
    private static int id;
    private final int obj_id;

    public Thing(String title) {
        this.type = title;
        id += 1;
        obj_id = id;
    }

    public String getType(){
        return type;
    }

    public String toString() {
        return "Вещь типа " + getType();
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Thing t = (Thing) o;
        return obj_id == t.obj_id;
    }

    @Override
    public int hashCode() {
        return obj_id;
    }

    public static class Boots extends Thing{
        private float size;

        public Boots(String title, float size) {
            super(title);
            this.size = size;
        }

        public float getSize(){
            return size;
        }
    }
}
