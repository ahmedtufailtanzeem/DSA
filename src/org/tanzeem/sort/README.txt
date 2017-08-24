// All 3 algorithms are in-place sort(They don't need extra memory)
// Insertion sort gives better performance compared to bubble and selection sort
// All 3 algorithms are in-memory
//sorted sort maintains order - 4 3 3' 2 1 --> 1 2 3 3' 4  (Strictly greater than, don't use >=)
//sorted sort maintains order - 4 3 3' 2 1 --> 1 2 3' 3 4  (>=)
//useful if we have Name|Age table--> First sort on Age, then sort on Name. If we use sorted both will look consistent