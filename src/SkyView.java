public class SkyView {
    private double[][] view;
    public SkyView(int row, int column, double[] scanned)
    {
        int a = 0;
        int b = 0;
        int c = column;
        c-= 1;
        this.view = new double[row][column];
        for(int i = 0; i < row; i++)
        {
            if(a == c)
            {
                for(a = c; a > 0; a--)
                {
                    view[i][a] = scanned[b];
                    b++;
                }
                System.out.println(a);
            }
            else {
                if (a == 0) {
                    for (a = 0; a < c; a++) {
                        view[i][a] = scanned[b];
                        b++;
                    }
                    System.out.println(a);
                }
            }
        }
    }
    public double getAverage(int startRow, int endRow, int startCol, int endCol)
    {
        double sum = 0;
        double nums = 0;
        for(int i = startRow; i <= endRow; i++)
        {
            for(int a = startCol; a < endCol; a++)
            {
                sum += view[i][a];
                nums++;
            }
        }
        return sum/nums;
    }
    public String toString()
    {
        String str = "";
        for(int a = 0; a < view.length; a++)
        {
            for(int b = 0; b < view[a].length; b++)
            {
                str += view[a][b] + ", ";
            }
        }
        return str;
    }
}
