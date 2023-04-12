# 20 Points

# Bubble?

The class below contains a method with the following signature,
<p style="font-family: 'courier new', courier;background-color:#f5f5f5;padding:10px 10px 10px 10px;border:solid 1px #dddddd;color:#5959e2;font-weight:bold;">
public static void bubble(int[] anArray)
</p>
Implement this method so that the contents of array <span style="font-family: 'courier new', courier;">anArray</span> are modified in the following way.

1.  Start at the first element in the array.  This is the current element.
2.  Compare the current element with its neighboring  element to the right.
3.  if the current element is smaller than its neighboring  element to the right, then swap the elements.
4.  If the neighboring element to the right is the last element, goto 6.
5.  Make the neighboring element to the right the current element.  Goto step 2
6.  Stop.

For example,

```java
int[] myArray = {13,2,15,7,22}
Foo.bubble(myArray);
```

The result is that the array <span style="font-family: 'courier new', courier;">myArray</span> now looks as follows,
<p style="font-family: 'courier new', courier;background-color:#f5f5f5;padding:10px 10px 10px 10px;border:solid 1px #dddddd;color:green;font-weight:bold;">
myArray <br>
<span style="padding:3px 3px 3px 3px;border:black solid 1px; background-color:#eeeeee;">*</span>---->
<span style="padding:3px 3px 3px 3px;border:black solid 1px; background-color:#eeeeee;">
13
</span>
<span style="padding:3px 3px 3px 3px;border:black solid 1px; background-color:#eeeeee;">
15
</span>
<span style="padding:3px 3px 3px 3px; border:black solid 1px; background-color:#eeeeee;">
7
</span>
<span style="padding:3px 3px 3px 3px; border:black solid 1px; background-color:#eeeeee;">
22
</span>
<span style="padding:3px 3px 3px 3px; border:black solid 1px; background-color:#eeeeee;">
2
</span>
</p>

<p>Using the resulting <span style="font-family: 'courier new', courier;">myArray</span> from the example above<p/>

```java
Foo.bubble(myArray);
```

The result is that the array <span style="font-family: 'courier new', courier;">myArray</span> now looks like,
<p style="font-family: 'courier new', courier;background-color:#f5f5f5;padding:10px 10px 10px 10px;border:solid 1px #dddddd;color:green;font-weight:bold;">
myArray <br>
<span style="padding:3px 3px 3px 3px;border:black solid 1px; background-color:#eeeeee;">*</span>---->
<span style="padding:3px 3px 3px 3px;border:black solid 1px; background-color:#eeeeee;">
15
</span>
<span style="padding:3px 3px 3px 3px;border:black solid 1px; background-color:#eeeeee;">
13
</span>
<span style="padding:3px 3px 3px 3px; border:black solid 1px; background-color:#eeeeee;">
22
</span>
<span style="padding:3px 3px 3px 3px; border:black solid 1px; background-color:#eeeeee;">
7
</span>
<span style="padding:3px 3px 3px 3px; border:black solid 1px; background-color:#eeeeee;">
2
</span>


Notice that calling `Foo.bubble(myArray)` two more times will sort the array.

<span style="padding:3px 3px 3px 3px; border-bottom: red solid 1px; color:#ff0000;">Note:</span>
<span style="color:red;">
This should work for an array of length 1 or an array of length 0.  In other words, the method should address those cases and not throw an exception.
</span>