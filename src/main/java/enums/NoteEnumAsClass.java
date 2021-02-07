package enums;

public class NoteEnumAsClass {
    public final static NoteEnumAsClass C = new NoteEnumAsClass("C", 100);
    public final static NoteEnumAsClass D = new NoteEnumAsClass("D", 200);
    public final static NoteEnumAsClass E = new NoteEnumAsClass("E", 300);
    public final static NoteEnumAsClass F = new NoteEnumAsClass("G", 400);

    private final String name;
    private final double frequency;
    private NoteEnumAsClass(String name, double frequency){
        this.name = name;
        this.frequency = frequency;
    }

    public double getFrequency() {
        return frequency;
    }

    public String name(){
        return name;
    }

    public static NoteEnumAsClass[] vallues(){
        return new NoteEnumAsClass[]{C, D, E, F};
    }
}
