public class SubtractScore {


public static int Subtract(PieceName name)
{
int value = 0;
    switch (name)
{
    case ACADEMY:
    case CASTLE:
    case INFIRMARY:
    case TOWER:
        value = 5;
        break;
    case ABBEY:
    case MANOR:
    case SQUARE:
        value = 4;
        break;
    case BRIDGE:
    case INN:
        value = 3;
        break;
    case STABLE:
        value = 2;
        break;
    case TAVERN:
        value = 1;
        break;
    }

    return value;
}





}
