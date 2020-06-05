import java.util.ArrayList;

public class NextFit implements Fit{
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


        Bin bin2 = new Bin();
        bin2 = arr.get(arr.size()-1); // 마지막 통을 리스트에서 받아옴
        if(bin2.check(item)) // 현재 아이템이 들어갈 수 있으면 넣어줘라
        {
            bin2.update(item);
            //showarr.showarr(arr);
            return;
        }

        Bin b = new Bin();
        b.update(item);
        arr.add(b);
        //showarr.showarr(arr);

    }
}
