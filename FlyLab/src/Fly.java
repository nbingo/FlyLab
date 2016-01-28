import java.awt.*;


public class Fly 
{
	Bristle  [] bristle  ;
	Color    [] eyeColor ;
	Color    [] bodyColor;
	Antenna  [] antenna  ;
	EyeShape [] eyeShape ;
	WingSize [] wingSize ;
	WingShape[] wingShape;
	WingVein [] wingVein ;
	WingAngle[] wingAngle;
	Gender   [] gender   ;
	
	public Fly (Bristle[] b, Color[] eyeC, Color[] bodyC, Antenna[] a, EyeShape[] eye, WingSize[] wSize, WingShape[] wShape, WingVein[] wVein, WingAngle[] wAngle, Gender[] g)
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
	
	public Fly(Gender[] g)
	{
		this(
				new Bristle  [] {Bristle.Wild  , Bristle.Wild  }, 
				new Color    [] {Color.RED     , Color.RED     }, 
				new Color    [] {Color.ORANGE  , Color.ORANGE  },
				new Antenna  [] {Antenna.Wild  , Antenna.Wild  },
				new EyeShape [] {EyeShape.Wild , EyeShape.Wild },
				new WingSize [] {WingSize.Wild , WingSize.Wild },
				new WingShape[] {WingShape.Wild, WingShape.Wild},
				new WingVein [] {WingVein.Wild , WingVein.Wild },
				new WingAngle[] {WingAngle.Wild, WingAngle.Wild}, 
				g
				);
	}
	public Fly()
	{
		this(new Gender[] {Gender.X, Gender.X});
	}
}
