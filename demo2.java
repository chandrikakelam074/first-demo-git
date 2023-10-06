# !/bin/bash

echo "enter the no which you want to check for prime:"
read no

flag=1

for ((i=2;i<=$no/2;i++));
do
        rem=$(($no%$i))
        if [ $rem -eq 0 ];
        then
                flag=0
                break
        fi
done
flag
if [ $flag -eq 1 ];
then
        echo "it is prime"
else
        echo "it is not prime"
fi

