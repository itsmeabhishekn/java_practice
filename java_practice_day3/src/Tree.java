import java.awt.*;

public class Tree {
    double height;
    double trunkLength;
    TreeType treetype;

    static Color TRUNK_COLOR = new Color(102,51,0);



    Tree(double height,double trunkLength, TreeType treetype ){
        this.height = height;
        this.trunkLength = trunkLength;
        this.treetype = treetype;
    }

    void grow(){
        this.height = this.height+10;
        this.trunkLength = this.trunkLength+1;
    }
    static void announceTree(){
        System.out.println("look  out that for  "+TRUNK_COLOR );
    }
    void tallTreeAnnouncement(){
        if(this.height>100){
            System.out.println(this.treetype+ " is a tall tree");
        }
    }
}
