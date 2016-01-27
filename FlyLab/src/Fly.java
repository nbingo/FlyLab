import java.awt.*;


public class Fly 
{
	Bristle   bristle  ;
	Color     eyeColor ;
	Color     bodyColor;
	Antenna   antenna  ;
	EyeShape  eyeShape ;
	WingSize  wingSize ;
	WingShape wingShape;
	WingVein  wingVein ;
	WingAngle wingAngle;
	Gender    gender   ;
	
	public Fly (Bristle b, Color eyeC, Color bodyC, Antenna a, EyeShape eye, WingSize wSize, WingShape wShape, WingVein wVein, WingAngle wAngle, Gender g)
	{
		bristle   = b;
		eyeColor  = eyeC;
		bodyColor = bodyC;
		antenna   = a;
		eyeShape  = eye;
		wingSize  = wSize;
		wingShape = wShape;
		wingVein  = wVein;
		wingAngle = wAngle;
		gender    = g;
	}
	
	public Fly()
	{
		this(Bristle.Wild, Color.RED, Color.ORANGE, Antenna.Wild, EyeShape.Wild, WingSize.Wild, WingShape.Wild, WingVein.Wild, WingAngle.Wild, Gender.Female);
	}
}
