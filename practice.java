ArrayList<Integer> arr_list = new ArrayList<Integer>();
for (int i=0; i<dataset.length; i++) {
    if (dataset[i].indexOf("X") >= 0){ 
       arr_list.add(dataset[i].indexOf("X"));  
    }else{
    System.out.println( 'Nothing' );
    }
}
System.out.println( "'X'가 있는 문자 개수: " + arr_list.size() );
