# BinPacking
#### 각각의 코드에서 주석표시된 showarr.showarr(arr);를 풀어주면 아래와 같은 과정이 나옵니다. (3개 있습니다.)



## 다음 적합

결과

![Next Fit](https://user-images.githubusercontent.com/62462277/83854336-898b0380-a751-11ea-80d1-4d3e4875a5b3.png)



과정

![다음 적합](https://user-images.githubusercontent.com/62462277/83856147-1767ee00-a754-11ea-8632-5636cbdac652.png)





## 최선적합

최선 적합은 통의 어레이리스트를 현재 남아있는 용량이 큰 순서로 재배열하여 비교해나가며 넣을 수 있는지 없는지 알아가며 넣을 수 있게 만들었습니다.



결과

![최선적합](https://user-images.githubusercontent.com/62462277/83855405-f81c9100-a752-11ea-89bb-a5637f2d619f.png)



과정

![best2](https://user-images.githubusercontent.com/62462277/83855406-f94dbe00-a752-11ea-8c4a-a3009e0f033c.png)



## 최악 적합

최악 적합은 통의 어레이리스트를 현재 남아있는 용량이 작은 순서로 배열하여 인덱스가 0일 때 못 넣으면 다른 모든 통에도 못 넣고 새로운 통이 필요하다는 점을 이용해 코드를 짰습니다.

결과

![최악적합](https://user-images.githubusercontent.com/62462277/83855412-fa7eeb00-a752-11ea-8a4a-cc18df33dd0f.png)



과정

![최악2](https://user-images.githubusercontent.com/62462277/83855414-fb178180-a752-11ea-890b-8403fb89e644.png)