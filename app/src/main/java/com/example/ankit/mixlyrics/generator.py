import json
from os import mkdir, chdir ,path , walk
import re
from urllib.request import urlopen
import zipfile
import os
import shutil

def get_name(_srt):
    if _srt == 'str':
        return 'String'
    if _srt == 'bool':
        return 'Boolean'
    if _srt == 'int':
        return 'int' 

def dump_parsers(_model_dict, _model_name, _file_name):

    __any_list      = False
    _return_object  = '\n\t\t\t' 
    _return_object += _model_name 
    _return_object += ' local_model = null;\n'

    _remote_parser_object_creation_lines = '\n'
    _remote_parser_object_init           = '\n'
    _parser_import_lines                 = 'import org.json.JSONException;\nimport org.json.JSONObject;\n'

    _class_declaration = '\nclass ' 
    _class_declaration+= _model_name 
    _class_declaration+= 'Parser {\n'
    _class_end_symbol  = '\n\t\t\t\n}'

    _parser_function_dec = '\n\t\tpublic ' 
    _parser_function_dec+= _model_name 
    _parser_function_dec+= ' parse' 
    _parser_function_dec+= _model_name 
    _parser_function_dec+= '(String json_object) {\n'

    _json_exception_block_start = '\t\t\ttry {'
    _json_exception_block_end   = ' \t\t\t} \n\t\t\tcatch (JSONException e){\n\n \t\t\t\t e.printStackTrace();\n\t\t\t}\n\n\t\t\treturn local_model;\n\t\t}'
    _json_object_dec_line       = '\n\t\t\t\t\tJSONObject jsobj = new JSONObject(json_object);'
    _parsing_operation_line     = ''
    _return_object_attr         = ''
    _model_init                 = ''
    _parser_class_cons_init ='\n\t\tpublic ' 
    _parser_class_cons_init+= _model_name
    _parser_class_cons_init+='Parser() {'
    _parser_class_cons_end  = '\t\t}\n'
    _parser_template        = ''

    for _t in _model_dict:

        if _model_dict[_t] == 'dict':
            _lib_ref = _t[0].capitalize() 
            _lib_ref+= _t[1:len(_t)]

            _return_object_attr += _t 
            _return_object_attr +=', '
            _remote_parser_object_creation_lines += '\t\t'
            _remote_parser_object_creation_lines += _lib_ref
            _remote_parser_object_creation_lines += 'ModelParser '
            _remote_parser_object_creation_lines += _t
            _remote_parser_object_creation_lines += '_parser = new '
            _remote_parser_object_creation_lines += _lib_ref
            _remote_parser_object_creation_lines += 'ModelParser();\n'

            _parsing_operation_line += '\n\n\t\t\t\t\t'
            _parsing_operation_line += _lib_ref
            _parsing_operation_line += 'Model '
            _parsing_operation_line += _t
            _parsing_operation_line += ' = '
            _parsing_operation_line += _t
            _parsing_operation_line += '_parser.parse'
            _parsing_operation_line += _lib_ref
            _parsing_operation_line += 'Model(jsobj.getJSONObject("'
            _parsing_operation_line += _t
            _parsing_operation_line += '").toString());'


        if _model_dict[_t] == 'slist':

            __any_list = True
            _lib_ref   = _t[0].capitalize() + _t[1:len(_t)]

            _return_object_attr     += _t
            _parsing_operation_line +=' '
            _parsing_operation_line += '\n\n\t\t\t\t\tArrayList<String>' 
            _parsing_operation_line += ' ' 
            _parsing_operation_line += _t 
            _parsing_operation_line += ' = new ArrayList<>();\n\t\t\t\t\tJSONArray ' 
            _parsing_operation_line += _t 
            _parsing_operation_line += '_arr = jsobj.getJSONArray("' 
            _parsing_operation_line += _t 
            _parsing_operation_line += '");\n'
            _parsing_operation_line += '\t\t\t\n\t\t\t\t\tfor(int i = 0 ;i<' 
            _parsing_operation_line += _t 
            _parsing_operation_line += '_arr.length();i++){\n\n '
            _parsing_operation_line += '\t\t\t\t\t\t' 
            _parsing_operation_line += _t 
            _parsing_operation_line += '.add((String)' 
            _parsing_operation_line += _t 
            _parsing_operation_line += '_arr.get(i)));\n\n\t\t\t\t\t}'

        if _model_dict[_t] == 'ilist':

            __any_list = True
            _lib_ref   = _t[0].capitalize() 
            _lib_ref  += _t[1:len(_t)]
            _return_object_attr += _t
            _return_object_attr +=', '
            _parsing_operation_line += '\n\n\t\t\t\t\tArrayList<Integer>' 
            _parsing_operation_line += ' ' 
            _parsing_operation_line += _t 
            _parsing_operation_line += ' = new ArrayList<>();\n\t\t\t\t\tJSONArray ' 
            _parsing_operation_line += _t 
            _parsing_operation_line += '_arr = jsobj.getJSONArray("' 
            _parsing_operation_line += _t 
            _parsing_operation_line += '");\n'
            _parsing_operation_line += '\t\t\t\n\t\t\t\t\tfor(int i = 0 ;i<' 
            _parsing_operation_line += _t 
            _parsing_operation_line += '_arr.length();i++){\n\n '
            _parsing_operation_line += '\t\t\t\t\t\t' 
            _parsing_operation_line += _t 
            _parsing_operation_line += '.add((int)' 
            _parsing_operation_line += _t 
            _parsing_operation_line += '_arr.get(i)));\n\n\t\t\t\t\t}'

        if _model_dict[_t] == 'list':
            __any_list = True
            _lib_ref   = _t[0].capitalize() + _t[1:len(_t)]
            # _parser_import_lines += 'import ' + _lib_ref + '.java;\n'         // import issue is solved with package
            # _parser_import_lines += 'import ' + _lib_ref +'Parser.java;\n'    // -do-
            _remote_parser_object_creation_lines += '\t\t' 
            _remote_parser_object_creation_lines += _lib_ref 
            _remote_parser_object_creation_lines += 'ModelParser ' 
            _remote_parser_object_creation_lines += _t 
            _remote_parser_object_creation_lines += '_parser;\n'
            _remote_parser_object_init           += '\t\t\t'
            _remote_parser_object_init           +=_t
            _remote_parser_object_init           +='_parser = new '
            _remote_parser_object_init           +=_lib_ref
            _remote_parser_object_init           +='ModelParser();\n' 
            _return_object_attr                  += _t 
            _return_object_attr                  += 's, '
            _parsing_operation_line += '\n\n\t\t\t\t\tArrayList<' 
            _parsing_operation_line += _lib_ref 
            _parsing_operation_line += 'Model>' 
            _parsing_operation_line += ' ' 
            _parsing_operation_line += _t 
            _parsing_operation_line += 's = new ArrayList<>();\n\t\t\t\t\tJSONArray ' 
            _parsing_operation_line += _t 
            _parsing_operation_line += '_arr = jsobj.getJSONArray("' 
            _parsing_operation_line += _t 
            _parsing_operation_line += '");\n'
            _parsing_operation_line += '\t\t\t\n\t\t\t\t\tfor(int i = 0 ;i<' 
            _parsing_operation_line += _t 
            _parsing_operation_line += '_arr.length();i++){\n\n '
            _parsing_operation_line += '\t\t\t\t\t\t' 
            _parsing_operation_line += _t 
            _parsing_operation_line += 's.add(' 
            _parsing_operation_line += _t 
            _parsing_operation_line += '_parser.parse' 
            _parsing_operation_line += _lib_ref 
            _parsing_operation_line += 'Model((String)' 
            _parsing_operation_line += _t 
            _parsing_operation_line += '_arr.get(i)));\n\n\t\t\t\t\t}'

        if _model_dict[_t] in ('str','int','bool'):
            if _model_dict[_t] == 'int':
                _return_object_attr += 'jsobj.getInt("' 
                _return_object_attr += _t 
                _return_object_attr += '") , '
            else:
                _return_object_attr += 'jsobj.get' 
                _return_object_attr += get_name(_model_dict[_t]) 
                _return_object_attr += '("' 
                _return_object_attr += _t 
                _return_object_attr += '") , '

    if __any_list:
        _parser_import_lines += 'import java.util.ArrayList;\n'
        _parser_import_lines += 'import org.json.JSONArray;\n'

    # tempting parser
    _model_init += '\n\n\t\t\t\t\tlocal_model = new '
    _model_init += _model_name
    _model_init += '('
    _model_init += _return_object_attr[:len(_return_object_attr)]
    _model_init += ');\n'

    _parser_template += _parser_import_lines 
    _parser_template += _class_declaration 
    _parser_template += _remote_parser_object_creation_lines
    _parser_template += _parser_class_cons_init
    _parser_template += _remote_parser_object_init
    _parser_template += _parser_class_cons_end
    _parser_template += _parser_function_dec
    _parser_template += _return_object
    _parser_template += _json_exception_block_start
    _parser_template += _json_object_dec_line
    _parser_template += _parsing_operation_line
    _parser_template += _model_init
    _parser_template += _json_exception_block_end
    _parser_template += _class_end_symbol

    with open(_file_name, 'w') as f:
        f.write(_parser_template)
        f.close()

def dump_model(_model_dict, _model_name, _file_name):
    _import_lines     = ''
    _attrs_dec        = ''  # fields
    _const_params     = ''
    _cons_assignments = ''
    __any_list        = False

    # templating import statements
    for _t in _model_dict:

        if _model_dict[_t] == 'dict':

            _ref_model_name  = _t[0].capitalize() 
            _ref_model_name += _t[1:len(_t)]

            _attrs_dec +='\tpublic '
            _attrs_dec +=_ref_model_name
            _attrs_dec +='Model'
            _attrs_dec += ' _'
            _attrs_dec +=_t
            _attrs_dec +=';'
            _attrs_dec +='\n'
            
            _const_params += _ref_model_name 
            _const_params +='Model'
            _const_params += ' ' 
            _const_params += _t
            _const_params += ', '
            
            _cons_assignments += '\t\tthis._'
            _cons_assignments +=_t
            _cons_assignments +=' = '
            _cons_assignments +=_t
            _cons_assignments +=';\n'

        if _model_dict[_t] =='slist':
            __any_list = True
            # _import_lines += 'import '+_lib_ref+'.java;\n'
            _attrs_dec += '\tpublic ArrayList<String> ' 
            _attrs_dec += _t 
            _attrs_dec += ';\n'

            _const_params += 'ArrayList<String> ' 
            _const_params += _t 
            _const_params += ', '

            _cons_assignments += '\t\tthis.' 
            _cons_assignments += _t 
            _cons_assignments += ' = ' 
            _cons_assignments += _t 
            _cons_assignments += ';\n'

        if _model_dict[_t] == 'ilist':
            __any_list = True

            _attrs_dec += '\tpublic ArrayList<Integer> ' 
            _attrs_dec += _t 
            _attrs_dec += ';\n'

            _const_params += 'ArrayList<Integer> ' 
            _const_params += _t 
            _const_params += ', '

            _cons_assignments += '\t\tthis.' 
            _cons_assignments += _t 
            _cons_assignments += ' = ' 
            _cons_assignments += _t 
            _cons_assignments += ';\n'

        if _model_dict[_t] == 'list':
            __any_list = True
            _lib_ref   = _t[0].capitalize() 
            _lib_ref   += _t[1:len(_t)]

            _attrs_dec += '\tpublic ArrayList<' 
            _attrs_dec += _lib_ref 
            _attrs_dec += 'Model> ' 
            _attrs_dec += _t 
            _attrs_dec += ';\n'

            _const_params += 'ArrayList<' 
            _const_params += _lib_ref 
            _const_params += 'Model> ' 
            _const_params += _t 
            _const_params += ', '

            _cons_assignments += '\t\tthis.' 
            _cons_assignments += _t 
            _cons_assignments += ' = ' 
            _cons_assignments += _t 
            _cons_assignments += ';\n'

        if _model_dict[_t] in ('str','int','bool'):

            _attrs_dec += '\tpublic ' 
            _attrs_dec += get_name(_model_dict[_t]) 
            _attrs_dec += ' ' 
            _attrs_dec += _t 
            _attrs_dec += ';\n'

            _const_params += get_name(_model_dict[_t]) 
            _const_params += ' ' 
            _const_params += _t 
            _const_params += ', '

            _cons_assignments += '\t\tthis.' 
            _cons_assignments += _t 
            _cons_assignments += ' = ' 
            _cons_assignments += _t 
            _cons_assignments += ';\n'

    if __any_list:
        _temp_import_store = _import_lines
        _import_lines      = 'import java.util.ArrayList;\n'
        _import_lines     += _temp_import_store

    _class_declaration  = 'class ' 
    _class_declaration += _model_name 
    _class_declaration += ' {\n'

    _class_end_symbol = '\n}'

    # templating constructor items
    _const_dec  = '\tpublic ' 
    _const_dec += _model_name 
    _const_dec += '(' 
    _const_dec += _const_params[:len(_const_params) - 2] 
    _const_dec += ') {\n\n' 
    _const_dec += _cons_assignments 
    _const_dec += '\n\t}\n'

    # templating model
    model_template  = _import_lines 
    model_template += '\n' 
    model_template += _class_declaration 
    model_template += '\n' 
    model_template += _attrs_dec 
    model_template += '\n' 
    model_template += _const_dec 
    model_template += _class_end_symbol

    with open(_file_name, 'w') as f:
        f.write(model_template)
        f.close()

def create_base(_json, _model_name):
    _dict = {}
    _json_dict = json.loads(_json)

    # preparing dictionary
    for _key in _json_dict:

        if type(_json_dict[_key]) is str:

            _dict[_key] = 'str'

        if type(_json_dict[_key]) is dict:

            _dict[_key] = 'dict'
            _new_json   =json.dumps(_json_dict[_key])

            _new_model_name  = _key[0].capitalize() 
            _new_model_name += _key[1:len(_key)]
            create_base(_new_json ,_new_model_name)

        if type(_json_dict[_key]) is list:

            # check for type-array or json object array
            _suspect_json = json.dumps(list(_json_dict[_key])[0])

            if _suspect_json[0] == '"':
                _dict[_key] = 'slist'

            if _suspect_json[0] == '{':
                _dict[_key] = 'list'

                _new_model_name  = _key[0].capitalize() 
                _new_model_name += _key[1:len(_key)]

                _new_json = _suspect_json
                create_base(_new_json, _new_model_name)

            if _suspect_json[0] not in ('"','{'):
                _dict[_key] = 'ilist'

        if type(_json_dict[_key]) is bool:

            _dict[_key] = 'bool'

        if type(_json_dict[_key]) is int:

            _dict[_key] = 'int'

    _model_name       += 'Model'
    _parser_file_name  = _model_name
    _parser_file_name +='Parser.java'
    _model_file_name   = _model_name 
    _model_file_name  += '.java'
    dump_model(_dict, _model_name, _model_file_name)
    dump_parsers(_dict, _model_name, _parser_file_name)

def re_format_json(_json):

# remove distracting chars
    _obs = '\r\n'
    _json = re.compile(_obs).sub(' ',_json)
# convert json array to a object
    data = json.loads(_json)
    if json.dumps(list(data)[0])[0] == '{':
        _target_json  = '{"j_array" :' 
        _target_json += _json 
        _target_json += '}'

        return _target_json
    else:
        return _json


def zipdir(path, ziph):
    print('for')
    print(path)
    for root, dirs, files in walk(path):
        print(dirs)
        for file in files:
            print(root)
            print(file)
            ziph.write(os.path.join(root,file))



# =====================================#
#            function calls            #
# =====================================#

#TODO:    Option 1 :   substitute url with your api below
#TODO:    Option 2 :   place your local json between three quoutes

#TODO                              =================-----------  And You Set To Go  -----------------=====================
 
#========#
#Option 1#
#========#
# _url = 'www.example.com/api'
# _target_json  = str(urlopen(_url).read()).encode('UTF-8')
#

#=========#
#Option 2 #
#=========#
# _target_json = """{
#                              "marks":[12,12,12,12],
#                              "role":"actor",
#                              "mix":true
#                   }"""

#_target_json = re_format_json(_target_json)
with open('tjson.json','r') as f:
    _target_json = re_format_json(f.read())
    if not path.isdir('Parsers'):
        mkdir('Parsers')
    chdir('Parsers')
    create_base(_target_json, 'Root')

# print(os.getcwd())
# folder_to_zip = os.getcwd()
# chdir('..')
# shutil.make_archive("myz","zip",folder_to_zip)

# if __name__ == '__main__':
#     zipf = zipfile.ZipFile('Parser.zip','w',zipfile.ZIP_DEFLATED)
#     zipdir('/Parsers',zipf)
#     zipf.close()


# zf = zipfile.ZipFile("myzipfile.zip", "w")
# for dirname, subdirs, files in os.walk("Parsers/"):
#     print(dirname)
#     zf.write(dirname)
#     for filename in files:
#         zf.write(os.path.join(dirname, filename))
# zf.close()