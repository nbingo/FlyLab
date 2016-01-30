import java.awt.*;

/**
 * The class for creating flies and with certain genotypes.
 * NB: a null in one of the genotypes indicates that there is only one allele of that gene in the fly, such as in males with a gene on the X chromosome. 
 * Of course, there will only be one null max per gene.
 * @version 1.0.0
 */
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
	
	/**
	 * Creates a Fly based on the genotype given. All parameters must be arrays of length two so as to represent two alleles.
	 * 
	 * @param b Bristle type
	 * @param eyeC Eye color
	 * @param bodyC Body color
	 * @param a Antenna type
	 * @param eye Eye shape/size
	 * @param wSize Wing size
	 * @param wShape Wing shape
	 * @param wVein Type of veins on wings
	 * @param wAngle Angle of wings
	 * @param g Gender (as in XX or XY)
	 */
	public Fly (
			Bristle  [] b     , 
			Color    [] eyeC  , 
			Color    [] bodyC , 
			Antenna  [] a     , 
			EyeShape [] eye   , 
			WingSize [] wSize , 
			WingShape[] wShape, 
			WingVein [] wVein , 
			WingAngle[] wAngle, 
			Gender   [] g
			)
	{
		bristle   = b     ;
		eyeColor  = eyeC  ;
		bodyColor = bodyC ;
		antenna   = a     ;
		eyeShape  = eye   ;
		wingSize  = wSize ;
		wingShape = wShape;
		wingVein  = wVein ;
		wingAngle = wAngle;
		gender    = g     ;
	}
	
	/**
	 * Creates a default fly of the specified gender.
	 * @param g The gender (as in XX or XY)
	 */
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
	
	/**
	 * Creates a default female fly.
	 */
	public Fly()
	{
		this(new Gender[] {Gender.X, Gender.X});
	}
}
