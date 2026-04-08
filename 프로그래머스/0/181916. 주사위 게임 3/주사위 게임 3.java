class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        if(a==b&&b==c&&c==d&&d==a)
            return 1111*a;
        // 3
        else if(a!=b&&b==c&&c==d)
            return (10*b+a)*(10*b+a);
        else if(b!=c&&c==d&&d==a)
            return (10*c+b)*(10*c+b);
        else if(c!=d&&d==a&&a==b)
            return (10*d+c)*(10*d+c);
        else if(d!=a&&a==b&&b==c)
            return (10*a+d)*(10*a+d);
        
        // 2 2
        if(a==b&&c==d)
            return (a+c)*Math.abs(a-c);
        else if(a==c&&b==d)
            return (a+b)*Math.abs(a-b);
        else if(a==d&&c==b)
            return (a+c)*Math.abs(a-c);
        // 2
        if(a==b)
            return c*d;
        else if(a==c)
            return b*d;
        else if(a==d)
            return b*c;
        else if(b==c)
            return a*d;
        else if(b==d)
            return a*c;
        else if(c==d)
            return a*b;
        // 1
        if(a!=b&&b!=c&&c!=d&&d!=a){
            int min1 = Math.min(a,b);
            int min2 = Math.min(c,d);
            return Math.min(min1, min2);
        }
        return answer;
    }
}