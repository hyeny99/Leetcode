import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;


public class Course3 {

	int duration = 0;
	
	public int scheduleCourse(int[][] courses) {
		
		Arrays.sort(courses, Comparator.comparingDouble(o -> o[1]));
		PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a); //maxheap
		
		for(int[] course : courses) {
			//if the duration of the course does not exceed the last day of the course
			if(course[0] <= course[1]) {
				if(course[0] + duration <= course[1]) {
					pq.offer(course[0]);
					duration += course[0];
				}else {
					if(pq.peek() > course[0]) {
						duration -= pq.remove();
						duration += course[0];
						pq.offer(course[0]);
					}
				}
			}
		}
		
		return pq.size();
		
	}
	//5,5  4,6  2,6
	
	
}
