import java.util.Arrays;
public class Trail_ASK
{
    /** Representation of the trail. The number of markers on the trail is markers.length */
    private int[] markers;
    
    /**
     *  Determines if a trail segment is level. A trail segment is defined by a starting marker.
     *  an ending marker, and all markers between those two markers.
     *  A trail segment is level if it has a difference between the maximum elevation
     *  and minimum elevation that is less than or equal to 10 meters.
     *  @param start - the index of the starting marker
     *  @param end - the index of the ending marker
     *      PRECONDITION: 0 <= start < end <= markers.length -1
     *  @return true - if the difference between the maximum and minumum elevation
     *                 on this segment of the trail is less than or equal to 10 meters;
     *                 false otherwise.
     */
    public boolean isLevelTrailSegment(int start, int end)
    {
        int[] array = Arrays.copyOfRange(markers, start, end+1);
        int large = array[0];
        int small = array[0];
        for (int i : array){
            if (i > large)
                large = i;
            if (i < small)
                small = i;
        }
        
        if (Math.abs(large - small)>10)
            return false;
        return true;
    }

    
    /**
     *  Determines if this trail is rated difficult. A trail is rated by counting the number of changes in
     *  elevation that are at least 30 meteres (up or down) between two consecutive markers. A trail with 3
     *  or more such changes is rated difficult.
     *  @return true - if the trail is rated difficult; false otherwise
     */
    public boolean isDifficult()
    {
        //to be implemented in part (b)
        int numTimes = 0;
        for (int i = 0; i < markers.length-1; i++){
            if (Math.abs(markers[i]-markers[i+1])>=30){
                numTimes++;
            }
        }
        if (numTimes>=3)
                return true;
        return false;
    }
    
    //Do not alter any of the following methods
    public Trail_ASK(int[] m)
    {
        markers = m;
    }
}