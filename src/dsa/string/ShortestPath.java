package dsa.string;

public class ShortestPath {
	public float shortestPath(String str) {
		int x=0,y=0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'N') {
				y++;
			}else if(str.charAt(i) == 'E') {
				x++;
			}else if(str.charAt(i) == 'S') {
				y--;
			}else {
				x--;
			}
		}
		return (float)Math.sqrt((x*x)+(y*y));
	}
	public static void main(String[] args) {
		String route = "WNEENESENNN";
		System.out.println(new ShortestPath().shortestPath(route)+" is shortest path of this route --> "+route);
	}
}
