public class Main {
    public static void main(String[] args) {
        Tree myFavouriteOakTree = new Tree(90, 2, TreeType.OAK);
        Tree myFavouriteMapleTree = new Tree(120, 3, TreeType.MALPEN);

        myFavouriteOakTree.tallTreeAnnouncement();
        myFavouriteMapleTree.tallTreeAnnouncement();

        Tree.announceTree();
    }
}
