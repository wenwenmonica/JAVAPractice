/**
 * Created by wenwenyang on 2/26/17.
 */
public class CarEqual {
    public enum Color {
        RED,
        BLUE,
        BLACK
    }
    public enum Model {
        A,
        B,
        C
    }
    private int _gas;
    private Color _color;
    private Model _model;

    public CarEqual(Color color, Model model, int gas) {
        _color = color;
        _model = model;
        _gas = gas;
    }
    @Override
    public  boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof CarEqual)) {
            return false;
        }
        CarEqual car = (CarEqual) obj;
        return this._color == car._color &&
                this._model == car._model;
    }
    public static void main(String[] args) {
        CarEqual c = new CarEqual(Color.RED, Model.A, 0);
        CarEqual d = new CarEqual(Color.RED, Model.A, 5);
        System.out.println(c.equals(d));
    }
}
