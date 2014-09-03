echo " "
echo "**************************"
echo "Transforming from JET to EGL"
echo "**************************"
echo " "
python ./jettojavaalmost.py
echo " "
echo "**************************"
python ./transform.py
echo "**************************"
echo " "
echo "**************************"
python ./eoltoeglalmost.py
echo "**************************"
echo " "
echo "**************************"
python ./formatter.py
echo "**************************"
echo " "

