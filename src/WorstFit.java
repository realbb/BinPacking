import java.util.ArrayList;

public class WorstFit implements Fit {
    @Override
    public void fit(ArrayList<Bin> arr, Item item) {
        ShowArr showarr= new ShowArr();
        if (arr.isEmpty()) // 처음에 아무것도 없을 때
        {
            Bin b = new Bin();
            b.update(item);
            arr.add(b);
            //showarr.showarr(arr);
            return;
        }

        Bin smallestbin = new Bin();
        smallestbin = arr.get(0);

        if (smallestbin.check(item))
        {
            smallestbin.update(item);

            // 현재 용량으로 배열 정리
            Bin temp = new Bin();
            for(int i=0 ; i<arr.size()-1 ; i++)
            {
                for(int j=0; j < arr.size()-1-i; j++)
                {
                    if(arr.get(j).currentCapacity > arr.get(j+1).currentCapacity)
                    {
                        temp = arr.get(j);
                        arr.set(j,arr.get(j+1));
                        arr.set(j+1,temp);
                    }
                }
            }

            //showarr.showarr(arr);
            return;
        }


        // 위가 실패해서 새롭게 통 생성
        Bin b = new Bin();
        b.update(item);
        arr.add(b);

        // 현재 용량으로 배열 정리
        Bin temp = new Bin();
        for(int i=0 ; i<arr.size()-1 ; i++)
        {
            for(int j=0; j < arr.size()-1-i; j++)
            {
                if(arr.get(j).currentCapacity > arr.get(j+1).currentCapacity)
                {
                    temp = arr.get(j);
                    arr.set(j,arr.get(j+1));
                    arr.set(j+1,temp);
                }
            }
        }
        //showarr.showarr(arr);
    }
}


