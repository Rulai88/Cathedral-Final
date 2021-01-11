public class Infirmary extends Piece {

    public Infirmary(Owner faction)
    {
        piecemap.add(65);
        piecemap.add(55);
        piecemap.add(45);
        piecemap.add(54);
        piecemap.add(56);
        ownedBy = faction;
        name = PieceName.INFIRMARY;
        score = 5;


    }

}
