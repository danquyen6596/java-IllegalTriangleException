package vn.codegym.QuyenLeSy;

public class IllegalTriangleException extends Exception {

    public IllegalTriangleException(float side) {
        super(side + " is larger than other two combined");

    }

}
