349. Intersection of Two Arrays
       method 1 :
           - Sort nums1 and nums2.
           - Create a HashSet to store unique elements.
           - Use a while loop with two pointers to find elements that appear in both nums1 and nums2, then save them into the HashSet.
          - Convert the HashSet to an array.
       method 2 :
          - Create HashSet to save the elements of nums1 and nums2 ( arr1 and arr2 ) 
          - use retainAll() filler the same element bettwen arr1 and arr2
          - Convert the HashSet ( arr1 and arr2 )  to an array 
