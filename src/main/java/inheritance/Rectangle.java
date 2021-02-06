package inheritance;

//przykład złego dziedziczennia!!!!
class Square extends Rectangle{

    //o jeden bok za dużo!!!!!
    public Square(int sideA, int sideB) {
        super(sideA, sideB);
        //bez sensu!!!
        if(sideA != sideB){
            sideA = sideB;
        }
    }
}

public class Rectangle {
    int sideA;
    int SideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        SideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return SideB;
    }

    public void setSideB(int sideB) {
        SideB = sideB;
    }
}
