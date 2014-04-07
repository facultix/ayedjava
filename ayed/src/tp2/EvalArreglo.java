package tp2;

public class EvalArreglo {
	Integer[] array = {1,2,3,4,5,6,7,8,9};
	Integer[] minmaxpro = evaluar(array);
	
	public static Integer[] evaluar(Integer[] arr){
		Integer[] mmp = {arr[0],arr[0],arr[0]};
		
		for(int i=1;i<arr.length;++i){
			if(arr[i]<mmp[0]){
				mmp[0]=arr[i];
			} else {
				if (arr[i]>mmp[1]) mmp[1] = arr[i];
			}
			mmp[2] = mmp[2] + arr[i];
		}
		mmp[2] = mmp[2] / arr.length;
		
		return mmp;
	}
	
	//inciso a //
	

}
