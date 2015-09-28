
public class Package {
	int length;
	int width;
	int height;
	int girth;
	int weight;
	boolean girthOK = true;
	boolean weightOK = true;
	public Package(){
		length = 30;
		width = 2;
		height = 1;
		weight = 70;
		girth = (2 * length) + (2 * width);
		canSend();
	}
	private void canSend(){
		if(girth > 100){
			girthOK = false;
		}
		if(weight > 70){
			weightOK = false;
		}
		if(!girthOK && !weightOK){
			System.out.println("Package is too big and heavy.\nWhat's in here? Babies?");
		}else if(!weightOK && girthOK){
			System.out.println("Package is too heavy");
		}else if(!girthOK && weightOK){
			System.out.println("Package is too big! \nHuman trafficking is not allowed!");
		}else{
			System.out.println("Package is okay");
		}
	}
}
