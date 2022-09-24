public class triangle {
    double base;
    double height;
    double lenSide1;
    double lenSide2;
    double lenSide3;

    public triangle(double base,
                    double height,
                    double lenSide1,
                    double lenSide2,
                    double lenSide3){
        this.base = base;
        this.height = height;
        this.lenSide1 = lenSide1;
        this.lenSide2 = lenSide2;
        this.lenSide3 = lenSide3;


    }

    public double findArea(){
        return (this.base*this.height)/2;
    }
}
