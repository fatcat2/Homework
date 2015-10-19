import gpdraw.DrawingTool;
import gpdraw.SketchPad;


public class KC2 {
	SketchPad s = new SketchPad(1000,1000);
	DrawingTool p = new DrawingTool(s);
	int level = 12;
	int count = level + 1;
	public KC2(){
		p.turnRight(90);
		p.up();
		p.move(-290);
		p.down();
	}
	public void draw(int length, int level){
		if(level < 1){
			drawCurve(length/3);
		}else {
			draw(length/3, level-1);
			p.turnLeft(60);
			draw(length/3, level-1);
			p.turnRight(120);
			draw(length/3, level-1);
			p.turnLeft(60);
			draw(length/3, level-1);
		}
	}
	public void drawCurve(int length){
		p.move(length/3);
		p.turnLeft(60);
		p.move(length/3);
		p.turnRight(120);
		p.move(length/3);
		p.turnLeft(60);
		p.move(length/3);
	}
}
