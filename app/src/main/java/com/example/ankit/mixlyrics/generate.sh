folder_name='json'
msg_file='msg.txt'
files=`ls $folder_name`
messages=`cat $msg_file`

for i in `seq 1 10`
do
file_=${files[$RANDOM % ${#files[@]} ]}
location=$folder_name'/'$file_
echo 'using json file $file_' 
python generator.py $location
message=${messages[$RANDOM % ${#messages[@]} ]}
git add .
git commit -m "$message"
done

git push origin master