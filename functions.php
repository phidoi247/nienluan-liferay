<?php

function open_file($value='')
{
    $handle = fopen('somefile.txt','r');
    fclose($handle);
}

/**
 * FORM
 */

function lay_get($str='') {
    #   
    if (isset($_GET[$str])) {
        return "&".$str.'='.$_GET[$str];
    }
    #
    return '';
    #
}

/**
 * FORM
 */

function cleanuserinput($dirty) {
    #   
    if (get_magic_quotes_gpc ()) {
        #       
        $clean = mysql_real_escape_string ( stripslashes ( $dirty ) );
        #
    } else {
        #
        $clean = mysql_real_escape_string ( $dirty );
        #
    }
    #
    return $clean;
    #
}






/**
 * URL
 */
function setURLBack() {
    $url = "http://" . $_SERVER ['SERVER_NAME'] . $_SERVER ['PHP_SELF'] . "?" . $_SERVER ['QUERY_STRING'];
    if ($_COOKIE ['server_prefere'] != $url)
        setcookie ( "server_prefere", $url, time () + 3600 * 1, "/" );
}





/**
 * DATE AGO
 * VD : format_interval("2014-08-10","2014-08-11");
 */
function iso8601($time=false) {
    if ($time === false) $time = time();
    $date = date('Y-m-d\TH:i:sO', $time);
    return (substr($date, 0, strlen($date)-2).':'.substr($date, -2));
}
// lay thoi gian theo $timezone (mac dinh la o Ho Chi Minh) va xuat ra dung dinh dang cua $time_format_string (mac dinh la dinh dang cua MySQL)
function get_current_time($timezone = "Asia/Ho_Chi_Minh", $time_format_string = "%Y-%m-%d %H:%M:%S") {
    date_default_timezone_set ( "Asia/Ho_Chi_Minh" );
    return strftime ( $time_format_string, time () );
}
function get_current_time2($timezone = "Asia/Ho_Chi_Minh", $time_format_string = "%H:%M %d-%m-%Y") {
    date_default_timezone_set ( "Asia/Ho_Chi_Minh" );
    return strftime ( $time_format_string, time () );
}
function get_current_time3($timezone = "Asia/Ho_Chi_Minh", $time_format_string = "%Y%m%d%M%H%S") {
    date_default_timezone_set ( "Asia/Ho_Chi_Minh" );
    return strftime ( $time_format_string, time () );
}
function vn_time($str_datetime) {
    date_default_timezone_set ( "Asia/Ho_Chi_Minh" );
    //$timestamp = strtotime ( $str_datetime );
    return strftime ( "%d/%m/%Y, %H:%M", $str_datetime );
}

function release_date($in) {
    $time = strtotime($in);
    $human_readable = date('d M Y', $time);
    $for_tools = date('Y-m-d', $time);
    echo "<time class='releasedate' datetime='{$for_tools}'>{$human_readable}</time>";
}


/**
 * CHECK EMAIL
 */
function isEmail($email) {
    if (eregi ( "^[a-z0-9]+[a-z0-9_-]*(\.[a-z0-9_-]+)*@[a-z0-9_-]+(\.[a-z0-9_-]+)*\.([a-z]+){2,}$", $email ))
        return 1;
    return 0;
}
// Try to remove anti-SPAM bits
function clean_AntiSPAM($email)
{
    $remove_spam = "![-_]?(NO|I[-_]?HATE|DELETE|REMOVE)[-_]?(THIS)?(ME|SPAM)?[-_]?!i";
    return preg_replace($remove_spam, "", trim($email));
}

// Try to check that this email address is valid
function is_emailable_address($email)
{
    // Exclude our mailing list hosting servers
    $hosts_regex = "!(lists\.php\.net|chek[^\.*]\.com)!i";
    $excluded_hosts = preg_match($hosts_regex, $email);

    // Email addresses need to match this pattern
    $email_regex = ":^([-!#\$%&'*+./0-9=?A-Z^_`a-z{|}~ ])+" .
                   "@([-!#\$%&'*+/0-9=?A-Z^_`a-z{|}~ ]+\\.)+" .
                   "[a-zA-Z]{2,6}\$:i";

    // If address is not under excluded hosts, and fits the regex,
    // then we belive that it is a good email address
    if (!$excluded_hosts && !empty($email)) {
        return preg_match($email_regex, $email);
    } else {
        return FALSE;
    }
}


if(!function_exists("admin_session")){
function admin_session($v='')
{
    global $secret_key;
    if (!empty($v)) {
        return $_SESSION[$secret_key.'_login'][$v];
    }
    else
    {
        return $_SESSION[$secret_key.'_login'];
    }

}}

function createPath($path) {
    if (is_dir($path)) return true;
    $prev_path = substr($path, 0, strrpos($path, '/', -2) + 1 );
    $return = createPath($prev_path);
    return ($return && is_writable($prev_path)) ? mkdir($path) : false;
}
//TEST : var_dump và exit .
if(!function_exists("info_host")){
function info_host()
{
    echo '<pre>' . print_r(get_defined_vars(), true) . '</pre>';

        exit();
}}
//TEST : var_dump và exit .
if(!function_exists("dump")){
function dump($arr, $exit = 1)
{
    echo "<pre>";
    var_dump($arr);
    echo "</pre>";
    if ($exit)
        exit();
}}
if(!function_exists("check_user")){
function check_user($v){
    if (!isset($_SESSION[$v]) && empty($_SESSION[$v]))
    {
        return FALSE;
    }
    else
    {
        return TRUE;
    }
}}
function get_youtube_id_from_url($url)
{
    $vid = preg_replace('/^.*(\?|\&)v\=/', '', $url);
    return $vid;
}
if(!function_exists("cuteo")){
function cuteo($v){
     $vi= strlen($v);
        if($vi==42){
                $v = substr($v,31,42);
                return $video_sub = $v;
        }else{
            error("Link video này không hợp lệ");

    }
}}
if ( ! function_exists('base_link'))
{
    function base_link($p='')
    {
        return base_url($p["tenkhongdau"].'.html');
    }
}
if ( ! function_exists('check_link'))
{
    function check_link($path,$p=array())
    {
        $kq="";
        if (empty($p[$path]))
        {
            //dump($p['thumb']);
            $kq='#';
        }
        else
        {
            $kq=$p[$path];
        }
        return $kq;
    }
}

if ( ! function_exists('thumb'))
{
    function thumb($path,$p=array())
    {
        $kq="";
        if ($p['thumb']=='')
        {
            //dump($p['thumb']);
            $kq=base_url()."images/no_image.jpg";
        }
        else
        {
            $kq=base_url('uploads/'.$path.'/thumb/'.$p['thumb']);
        }
        return $kq;
    }
}
if ( ! function_exists('photo'))
{
    function photo($path,$p=array())
    {
        $kq="";
        if ($p['photo']=='')
        {
            //dump($p['thumb']);
            $kq=base_url()."images/no_image.jpg";
        }
        else
        {
            $kq=base_url('uploads/'.$path.'/'.$p['photo']);
        }
        return $kq;
    }
}
if ( ! function_exists('shrink'))
{
    function shrink($path,$p=array())
    {
        $kq="";
        if ($p['shrink']=='')
        {
            //dump($p['thumb']);
            $kq=base_url()."images/no_image.jpg";
        }
        else
        {
            $kq=base_url('uploads/'.$path.'/shrink/'.$p['shrink']);
        }
        return $kq;
    }
}
if ( ! function_exists('watermark'))
{
    function watermark($path,$p=array())
    {
        $kq="";
        if ($p['watermark']=='')
        {
            //dump($p['thumb']);
            $kq=base_url()."images/no_image.jpg";
        }
        else
        {
            $kq=base_url('uploads/'.$path.'/watermark/'.$p['watermark']);
        }
        return $kq;
    }
}
function make_date($time, $dot = '.', $lang = 'vi', $f = false) {
    if (!empty($time))
    {
        $str = ($lang == 'vi') ? date("d{$dot}m{$dot}Y", $time) : date("m{$dot}d{$dot}Y", $time);
        if ($f) {
            $thu['vi'] = array('Chủ nhật', 'Thứ hai', 'Thứ ba', 'Thứ tư', 'Thứ năm', 'Thứ sáu', 'Thứ bảy');
            $thu['en'] = array('Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday');
            $str = $thu[$lang][date('w', $time) ] . ', ' . $str;
        }
        return $str;
    }
    else
    {
        return '';
    }


}
function show_time($timestamp) {
    $datetime = date("Y-m-d H:i:s", $timestamp);
    return $datetime;
}
if ( ! function_exists('POST'))
{
    function POST($p='')
    {
        if (isset($_POST[$p]))
        {
           return addslashes($_POST[$p]);
        }
        else
        return NULL;
    }
}
function check_slug($arr = array()) {
    global $db;
    $db->where("tenkhongdau", $arr['tenkhongdau']);

    $rs = $db->getOne("slug");
    if ($db->count > 0) {
        return FALSE;
    } else {
        return TRUE;
    }
}
function slug_delete($arr = array()) {
    global $db;
    $db->where('template', $arr['template']);
    $db->where('id_chucnang', $arr['id_chucnang']);

    if ($db->delete('slug')) {
        return TRUE;
    } else {
        return FALSE;
    }
}
function slug_insert($arr = array()) {
    global $db;
    $data['tenkhongdau'] = $arr['tenkhongdau'];
    $data['chucnang'] = $arr['chucnang'];
    $data['template'] = $arr['template'];
    $data['id_chucnang'] = $arr['id_chucnang'];
    $data['lang'] = $arr['lang'];
    if ($db->insert('slug', $data)) {
        return TRUE;
    } else {
        return FALSE;
    }
}
function slug_update($arr = array()) {
    global $db;
    $data['tenkhongdau'] = $arr['tenkhongdau'];
    $data['chucnang'] = $arr['chucnang'];
    $data['template'] = $arr['template'];
    $data['id_chucnang'] = $arr['id_chucnang'];
    $data['lang'] = $arr['lang'];
    //
    $db->where('chucnang', $arr['chucnang']);
    $db->where('id_chucnang', $arr['id_chucnang']);

    if ($db->update('slug', $data)) {
        return TRUE;
    } else {
        return FALSE;
    }
}

/**
 * Tach từ khóa từ chuỗi
 * @param  string $string Chuỗi truyền vào
 * @return array         Mảng
 */
function extract_keywords($str, $minWordLen = 3, $minWordOccurrences = 2, $asArray = false) {
    function keyword_count_sort($first, $sec) {
        return $sec[1] - $first[1];
    }
    $str = preg_replace('/[^\p{L}0-9 ]/', ' ', $str);
    $str = trim(preg_replace('/\s+/', ' ', $str));

    $words = explode(' ', $str);
    $keywords = array();
    while (($c_word = array_shift($words)) !== null) {
        if (strlen($c_word) < $minWordLen) continue;

        $c_word = strtolower($c_word);
        if (array_key_exists($c_word, $keywords)) $keywords[$c_word][1]++;
        else $keywords[$c_word] = array($c_word, 1);
    }
    usort($keywords, 'keyword_count_sort');

    $final_keywords = array();
    foreach ($keywords as $keyword_det) {
        if ($keyword_det[1] < $minWordOccurrences) break;


        array_push($final_keywords, $keyword_det[0]);
    }
    return $asArray ? $final_keywords : implode(', ', $final_keywords);
}
function stt($table = '',$type='') {
    if (!empty($table)) {
        global $db;
        
        if (!empty($type)) {
            $db->where('type',$type);
        }
        $db->orderBy("stt", "desc");
        $rs = $db->getOne($table);
        return $rs['stt'] + 1;
    } else {
        return 1;
    }
}
function post($post = '') {
    if (isset($_POST[$post]) && !empty($_POST[$post])) {
        return $_POST[$post];
    } else {
        return NULL;
    }
}

function check_page() {
    if (isset($_GET['page'])) {
        return "&page=$_GET[page]";
    } else {
        return NULL;
    }
}

function chuyen_chuoi($str){

    // In thường 
    $str = preg_replace("/(à|á|ạ|ả|ã|â|ầ|ấ|ậ|ẩ|ẫ|ă|ằ|ắ|ặ|ẳ|ẵ)/", 'a', $str); 
    $str = preg_replace("/(è|é|ẹ|ẻ|ẽ|ê|ề|ế|ệ|ể|ễ)/", 'e', $str); 
    $str = preg_replace("/(ì|í|ị|ỉ|ĩ)/", 'i', $str); 
    $str = preg_replace("/(ò|ó|ọ|ỏ|õ|ô|ồ|ố|ộ|ổ|ỗ|ơ|ờ|ớ|ợ|ở|ỡ)/", 'o', $str); 
    $str = preg_replace("/(ù|ú|ụ|ủ|ũ|ư|ừ|ứ|ự|ử|ữ)/", 'u', $str); 
    $str = preg_replace("/(ỳ|ý|ỵ|ỷ|ỹ)/", 'y', $str); 
    $str = preg_replace("/(đ)/", 'd', $str);    
    
    // In đậm 
    $str = preg_replace("/(À|Á|Ạ|Ả|Ã|Â|Ầ|Ấ|Ậ|Ẩ|Ẫ|Ă|Ằ|Ắ|Ặ|Ẳ|Ẵ)/", 'A', $str); 
    $str = preg_replace("/(È|É|Ẹ|Ẻ|Ẽ|Ê|Ề|Ế|Ệ|Ể|Ễ)/", 'E', $str); 
    $str = preg_replace("/(Ì|Í|Ị|Ỉ|Ĩ)/", 'I', $str); 
    $str = preg_replace("/(Ò|Ó|Ọ|Ỏ|Õ|Ô|Ồ|Ố|Ộ|Ổ|Ỗ|Ơ|Ờ|Ớ|Ợ|Ở|Ỡ)/", 'O', $str); 
    $str = preg_replace("/(Ù|Ú|Ụ|Ủ|Ũ|Ư|Ừ|Ứ|Ự|Ử|Ữ)/", 'U', $str); 
    $str = preg_replace("/(Ỳ|Ý|Ỵ|Ỷ|Ỹ)/", 'Y', $str); 
    $str = preg_replace("/(Đ)/", 'D', $str); 
    
    $str = html_entity_decode ($str); 
    //  KY TU DAC BIET
    $str = str_replace("ç","c",$str); 
    $str = str_replace("Ç","C",$str); 
    $str = str_replace(" / ","-",$str); 
    $str = str_replace("/","-",$str); 
    $str = str_replace(" - ","-",$str); 
    $str = str_replace("_","-",$str); 
    $str = str_replace(" ","-",$str); 
    $str = str_replace( "ß", "-", $str); 
    $str = str_replace( "&", "-", $str); 
    $str = str_replace( "%", "-", $str); 
    $str = str_replace("----","-",$str); 
    $str = str_replace("---","-",$str); 
    $str = str_replace("--","-",$str); 
     
    $str = str_replace(array(' ','_'), '-', $str);  
    $str = str_replace(array(',','/',':','{','}','[',']','!','@','#','$','%','^','&','*','(',')','=','+','|','`','.','<','>','"'),"",$str);

    return $str; // Trả về chuỗi đã chuyển 
}

if (!function_exists("khongdau")) {

    function khongdau($str, $separator = '-') {
        $str = mb_strtolower($str);
        $str = preg_replace('/(à|á|ạ|ả|ã|â|ầ|ấ|ậ|ẩ|ẫ|ă|ằ|ắ|ặ|ẳ|ẵ)/', 'a', $str);
        $str = preg_replace('/(è|é|ẹ|ẻ|ẽ|ê|ề|ế|ệ|ể|ễ)/', 'e', $str);
        $str = preg_replace('/(ì|í|ị|ỉ|ĩ)/', 'i', $str);
        $str = preg_replace('/(ò|ó|ọ|ỏ|õ|ô|ồ|ố|ộ|ổ|ỗ|ơ|ờ|ớ|ợ|ở|ỡ)/', 'o', $str);
        $str = preg_replace('/(ù|ú|ụ|ủ|ũ|ư|ừ|ứ|ự|ử|ữ)/', 'u', $str);
        $str = preg_replace('/(ỳ|ý|ỵ|ỷ|ỹ)/', 'y', $str);
        $str = preg_replace('/(đ)/', 'd', $str);
        $str = url_title($str, $separator);
        return $str;
    }
}

if (!function_exists('url_title')) {
    function url_title($str, $separator = '-', $lowercase = FALSE) {
        if ($separator == 'dash') {
            $separator = '-';
        } else if ($separator == 'underscore') {
            $separator = '_';
        }

        $q_separator = preg_quote($separator);

        $trans = array('&.+?;' => '', '[^a-z0-9 _-]' => '', '\s+' => $separator, '(' . $q_separator . ')+' => $separator);

        $str = strip_tags($str);

        foreach ($trans as $key => $val) {
            $str = preg_replace("#" . $key . "#i", $val, $str);
        }

        if ($lowercase === TRUE) {
            $str = strtolower($str);
        }

        return trim($str, $separator);
    }
}
function is_ajax() {
    return isset($_SERVER['HTTP_X_REQUESTED_WITH']) && strtolower($_SERVER['HTTP_X_REQUESTED_WITH']) == 'xmlhttprequest';
}
function form_select($text,$name,$items = array(), $x_key = '', $x_value = '', $default = '') {
    $rs = "";
    $rs = "<div class='form-group'>";
    $rs.= "<label for='$name' class='col-sm-3'>$text</label>";
    $rs.= "<div class='col-sm-9'>";
    $rs.= "<select class='form-control' name='$name' id='$name' required>";
    foreach ($items as $key => $value) {
        if ($default == $value[$x_key]) {
            $rs.= "<option value='$value[$x_key]'  selected='selected'>$value[$x_value]</option>";
        } else {
            $rs.= "<option value='$value[$x_key]' >$value[$x_value]</option>";
        }
    }
    $rs.= '</select>';
    $rs.= "</div>";
    $rs.= "</div>";
    return $rs;
}

/**
 * [FunctionName description]
 * @param string $value [description]
 */
function form_file($text = '', $name = '', $value = '',$requ='') {
    $rs = "";
    $rs = "<div class='form-group'>";
    $rs.= "<label for='$name' class='col-sm-3'>$text</label>";
    $rs.= "<div class='col-sm-9'>";
    $rs.= "<input type='file' class='form-control' name='$name' id='$name' multiple $requ>";
    if (empty($value)) {
        $rs.= "<img id='preview' src='images/no_image.jpg' width='150'/>";
    } else {
        $rs.= "<img id='preview' src='$value' width='150'/>";
    }

    $rs.= "</div>";
    $rs.= "</div>";
    return $rs;
}

/**
 * [FunctionName description]
 * @param string $value [description]
 */
function form_tags($text = '', $name = '', $value = '', $required = FALSE) {
    if ($required) {
        $required = 'required';
    }
    $rs = "";
    $rs = "<div class='form-group'>";
    $rs.= "<label for='$name' class='col-sm-3'>$text</label>";
    $rs.= "<div class='col-sm-9'>";
    $rs.= "<input type='text' class='form-control' name='$name' id='$name' value='$value' $required data-role='tagsinput'>";
    $rs.= "</div>";
    $rs.= "</div>";
    return $rs;
}
/**
 * [FunctionName description]
 * @param string $value [description]
 */
function form_password($text = '', $name = '', $value = '', $required = FALSE) {
    if ($required) {
        $required = 'required';
    }
    $rs = "";
    $rs = "<div class='form-group'>";
    $rs.= "<label for='$name' class='col-sm-3'>$text</label>";
    $rs.= "<div class='col-sm-9'>";
    $rs.= "<input type='password' class='form-control' name='$name' id='$name' value='$value' $required>";
    $rs.= "</div>";
    $rs.= "</div>";
    return $rs;
}
/**
 * [FunctionName description]
 * @param string $value [description]
 */
function form_text($text = '', $name = '', $value = '', $required = FALSE) {
    if ($required) {
        $required = 'required';
    }
    $rs = "";
    $rs = "<div class='form-group'>";
    $rs.= "<label for='$name' class='col-sm-3'>$text</label>";
    $rs.= "<div class='col-sm-9'>";
    $rs.= "<input type='text' class='form-control' name='$name' id='$name' value='$value' $required>";
    $rs.= "</div>";
    $rs.= "</div>";
    return $rs;
}
/**
 * [FunctionName description]
 * @param string $value [description]
 */
function form_number($text = '', $name = '', $value = '', $required = FALSE) {
    if ($required) {
        $required = 'required';
    }
    $rs = "";
    $rs = "<div class='form-group'>";
    $rs.= "<label for='$name' class='col-sm-3'>$text</label>";
    $rs.= "<div class='col-sm-9'>";
    $rs.= "<input type='number' class='form-control' name='$name' id='$name' value='$value' $required>";
    $rs.= "</div>";
    $rs.= "</div>";
  $rs.= "<script>";

$rs.= "$(document).ready(function () {";

 $rs.= " $('#$name').keypress(function (e) {";

 $rs.= "     if (e.which != 8 && e.which != 0 && (e.which < 48 || e.which > 57)) {";

 $rs.= "           alertify.error('Chỉ nhập số');
               return false;";
 $rs.= "    }
   });
});
</script>";






    return $rs;
}
/**
 * [FunctionName description]
 * @param string $value [description]
 */
function form_textarea($text = '', $name = '', $value = '', $row = '2') {
    $rs = "";
    $rs = "<div class='form-group'>";
    $rs.= "<label for='$name' class='col-sm-3'>$text</label>";
    $rs.= "<div class='col-sm-9'>";
    $rs.= "<textarea class='form-control' name='$name' id='$name' rows='$row'>$value</textarea>";
    $rs.= "</div>";
    $rs.= "</div>";
    return $rs;
}

/**
 * [FunctionName description]
 * @param string $value [description]
 */
function form_editor($text = '', $name = '', $value = '',$requ='') {
    $rs = "";
    $rs = "<div class='form-group'>";
    $rs.= "<label for='$name' class='col-sm-3'>$text</label>";
    $rs.= "<div class='col-sm-12'>";
    $rs.= "<textarea class='form-control' name='$name' id='$name' $requ>$value</textarea>";
    $rs.= "</div>";
    $rs.= "</div>";
    return $rs;
}

/**
 * [FunctionName description]
 * @param string $value [description]
 */
function form_checkbox($text = '', $name = '', $value = '') {
    $value = $value == TRUE ? 'checked' : '';
    $rs = "";
    $rs = "<div class='form-group'>";
    $rs.= "<label for='$name' class='col-sm-3'>$text</label>";
    $rs.= "<div class='col-sm-9'>";
    $rs.= "<div class='checkbox'><label><input type='checkbox' name='$name' id='$name' $value></label></div>";
    $rs.= "</div>";
    $rs.= "</div>";
    return $rs;
}

/**
 * LOAI BO KY TU DAT BIET
 */

function magic_quote($str, $id_connect = false) {
    if (is_array($str)) {
        foreach ($str as $key => $val) {
            $str[$key] = escape_str($val);
        }
        return $str;
    }
    if (is_numeric($str)) {
        return $str;
    }
    if (get_magic_quotes_gpc()) {
        $str = stripslashes($str);
    }
    if (function_exists('mysql_real_escape_string') AND is_resource($id_connect)) {
        return mysql_real_escape_string($str, $id_connect);
    } elseif (function_exists('mysql_escape_string')) {
        return mysql_escape_string($str);
    } else {
        return addslashes($str);
    }
}

/**
 * [redirect description]
 * @param  string $url [description]
 * @return [type]      [description]
 */
function redirect($url = '') {
    echo '<script language="javascript">window.location = "' . $url . '" </script>';
    exit();
}
function redirect_current($value = '') {

    // code...


}
function getCurrentURL()
{
    $pageURL = 'http';
    if (isset($_SERVER["HTTPS"])) {
        if ($_SERVER["HTTPS"] == "on") {
            $pageURL .= "s";
        }
    }
    $pageURL .= "://";
    if ($_SERVER["SERVER_PORT"] != "80") {
        $pageURL .= $_SERVER["SERVER_NAME"] . ":" . $_SERVER["SERVER_PORT"] . $_SERVER["REQUEST_URI"];
    } else {
        $pageURL .= $_SERVER["SERVER_NAME"] . $_SERVER["REQUEST_URI"];
    }
    $pageURL = explode("&page=", $pageURL);
    return $pageURL[0];
}
if (!function_exists('base_thumb')) {
    function base_thumb($path, $p = array()) {
        $kq = "";
        if ($p['thumb'] == '') {

            //dump($p['thumb']);
            $kq = base_url() . "images/no_image.jpg";
        } else {
            $kq = base_url($path . $p['thumb']);
        }
        return $kq;
    }
}
if (!function_exists('hienthi')) {
    function hienthi($hienthi, $p = array()) {
        global $com, $kq;
        if ($p[$hienthi] == 0) {

            $kq = "<a href='index.php?com=" . $com . "&act=view&id=" . $p['id'] . "&" . $hienthi . "=0'" . "><i class='fa fa-check'></i></a>";
        } else {
            $kq = "<a href='index.php?com=" . $com . "&act=view&id=" . $p['id'] . "&" . $hienthi . "=1'" . "><i class='fa fa-check'></i></a>";
        }
        return $kq;
    }
}
if (!function_exists('show_column')) {
    function show_column($table, $column, $p = array()) {
        global $com, $kq;
        if ($p[$column] == 1) {

            $kq = "<a class='show_column' id='" . $p['id'] . "' column='" . $column . "' status='" . $p[$column] . "' table='" . $table . "' ><i class='fa fa-star'></i></a>";
        } else {
            $kq = "<a class='show_column' id='" . $p['id'] . "' column='" . $column . "' status='" . $p[$column] . "' table='" . $table . "' ><i class='fa fa-star-o'></i></a>";
        }
        return $kq;
    }
}
function base_url($str = '') {
    if (isset($_SERVER['HTTP_HOST'])) {
        $base_url = isset($_SERVER['HTTPS']) && strtolower($_SERVER['HTTPS']) !== 'off' ? 'https' : 'http';
        $base_url.= '://' . $_SERVER['HTTP_HOST'];
        $base_url.= str_replace(basename($_SERVER['SCRIPT_NAME']), '', $_SERVER['SCRIPT_NAME']);
        $base_url.= $str;
    } else {
        $base_url = 'http://localhost/';
        $base_url.= $str;
    }
    return $base_url;
}
function current_url() {
    $pageURL = 'http';
    if (isset($_SERVER["HTTPS"])) {
        if ($_SERVER["HTTPS"] == "on") {
            $pageURL.= "s";
        }
    }
    $pageURL.= "://";
    if ($_SERVER["SERVER_PORT"] != "80") {
        $pageURL.= $_SERVER["SERVER_NAME"] . ":" . $_SERVER["SERVER_PORT"] . $_SERVER["REQUEST_URI"];
    } else {
        $pageURL.= $_SERVER["SERVER_NAME"] . $_SERVER["REQUEST_URI"];
    }
    $pageURL = explode("&page=", $pageURL);
    return $pageURL[0];
}
function paging_home($r, $mxR = 5, $mxP = 5, $class_paging = '') {
    $url = current_url();
    $curPg = isset($_GET['page']) ? $_GET['page'] : 1;
    if ($curPg < 1) $curPg = 1;
    if ($mxR < 1) $mxR = 5;
    if ($mxP < 1) $mxP = 5;
    $totalRows = count($r);
    if ($totalRows == 0) return array('source' => NULL, 'paging' => NULL);
    $totalPages = ceil($totalRows / $mxR);
    if ($curPg > $totalPages) $curPg = $totalPages;
    $_SESSION['maxRow'] = $mxR;
    $_SESSION['curPage'] = $curPg;
    $r2 = array();
    $paging = "";

    //-------------tao array------------------
    $start = ($curPg - 1) * $mxR;
    $end = ($start + $mxR) < $totalRows ? ($start + $mxR) : $totalRows;
    $j = 0;
    for ($i = $start; $i < $end; $i++) $r2[$j++] = $r[$i];

    //-------------tao chuoi------------------
    $curRow = ($curPg - 1) * $mxR + 1;
    if ($totalRows > $mxR) {
        $start = 1;
        $end = 1;
        $paging1 = "";
        for ($i = 1; $i <= $totalPages; $i++) {
            if (($i > ((int)(($curPg - 1) / $mxP)) * $mxP) && ($i <= ((int)(($curPg - 1) / $mxP + 1)) * $mxP)) {
                if ($start == 1) $start = $i;
                if ($i == $curPg) {
                    $paging1.= "<li class=\"active\">";
                    $paging1.= " <a >" . $i . "</a> ";

                    //dang xem
                    $paging1.= "</li>";
                } else {
                    $paging1.= "<li>";
                    $paging1.= " <a href='" . $url . "&page=" . $i . "'  class=\"{$class_paging}\">" . $i . "</a> ";
                    $paging1.= "</li>";
                }
                $end = $i;
            }
        }

        //tinh paging
        //$paging.= "Go to page :&nbsp;&nbsp;" ;
        //if($curPg>$mxP)
        //{
        if ($curPg == 1) {
            $paging.= "<li class=\"disabled\">";
        } else {
            $paging.= "<li>";
        }
        $paging.= " <a href='" . $url . "' class=\"{$class_paging}\" >&laquo;</a> ";

        //ve dau
        $paging.= "</li>";

        if ($curPg == 1) {
            $paging.= "<li class=\"disabled\">";
        } else {
            $paging.= "<li>";
        }
        $paging.= " <a href='" . $url . "&page=" . ($curPg - 1) . "' class=\"{$class_paging}\" >&#8249;</a> ";

        //ve truoc
        $paging.= "</li>";

        //}
        $paging.= $paging1;

        //if(((int)(($curPg-1)/$mxP+1)*$mxP) < $totalPages)
        //{
        //$paging .=" <a href='".$url."&curPage=".($end+1)."' class=\"{$class_paging}\" >&#8250;</a> "; //ke
        if ($curPg == $totalPages) {
            $paging.= "<li class=\"disabled\">";
        } else {
            $paging.= "<li>";
        }

        $paging.= " <a href='" . $url . "&page=" . ($curPg + 1) . "' class=\"{$class_paging}\" >&#8250;</a> ";

        //ke
        $paging.= "</li>";
        if ($curPg == $totalPages) {
            $paging.= "<li class=\"disabled\">";
        } else {
            $paging.= "<li>";
        }
        $paging.= " <a href='" . $url . "&page=" . ($totalPages) . "' class=\"{$class_paging}\" >&raquo;</a> ";

        //ve cuoi
        $paging.= "</li>";

        //}


    }
    $r3['curPage'] = $curPg;
    $r3['source'] = $r2;
    $r3['paging'] = $paging;

    //echo '<pre>';var_dump($r3);echo '</pre>';
    return $r3;
}
function dump($arr, $exit = 1) {
    echo "<pre>";
    var_dump($arr);
    echo "</pre>";
    if ($exit) exit();
}
function upload_image($file, $extension, $folder, $newname = '') {
    if (isset($_FILES[$file]) && !$_FILES[$file]['error']) {
        $tmp = explode(".", $_FILES[$file]["name"]);
        $ext = end($tmp);
        $name = basename($_FILES[$file]['name'], '.' . $ext);
        if (strpos($extension, $ext) === false) {
            alert('Chỉ hỗ trợ upload file dạng ' . $extension);
            return false;

            // không hỗ trợ


        }
        if ($newname == '' && file_exists($folder . $_FILES[$file]['name'])) for ($i = 0; $i < 100; $i++) {
            if (!file_exists($folder . $name . $i . '.' . $ext)) {
                $_FILES[$file]['name'] = $name . $i . '.' . $ext;
                break;
            }
        } else {
            $_FILES[$file]['name'] = $newname . '.' . $ext;
        }
        if (!copy($_FILES[$file]["tmp_name"], $folder . $_FILES[$file]['name'])) {
            if (!move_uploaded_file($_FILES[$file]["tmp_name"], $folder . $_FILES[$file]['name'])) {
                return false;
            }
        }
        return $newname . '.' . $ext;
    }
    return false;
}
function create_thumb($file, $width, $height, $folder, $file_name, $zoom_crop = '1') {

    // ACQUIRE THE ARGUMENTS - MAY NEED SOME SANITY TESTS?
    $new_width = $width;
    $new_height = $height;
    if ($new_width && !$new_height) {
        $new_height = floor($height * ($new_width / $width));
    } else if ($new_height && !$new_width) {
        $new_width = floor($width * ($new_height / $height));
    }
    $image_url = $folder . $file;
    $origin_x = 0;
    $origin_y = 0;

    // GET ORIGINAL IMAGE DIMENSIONS
    $array = getimagesize($image_url);
    if ($array) {
        list($image_w, $image_h) = $array;
    } else {
        die("NO IMAGE $image_url");
    }
    $width = $image_w;
    $height = $image_h;

    // ACQUIRE THE ORIGINAL IMAGE
    //$image_ext = trim(strtolower(end(explode('.', $image_url))));
    $tmp = explode(".", $image_url);
    $image_ext = end($tmp);
    switch (strtoupper($image_ext)) {
        case 'JPG':
        case 'JPEG':
            $image = imagecreatefromjpeg($image_url);
            $func = 'imagejpeg';
            break;

        case 'PNG':
            $image = imagecreatefrompng($image_url);
            $func = 'imagepng';
            break;

        case 'GIF':
            $image = imagecreatefromgif($image_url);
            $func = 'imagegif';
            break;

        default:
            die("UNKNOWN IMAGE TYPE: $image_url");
    }

    // scale down and add borders
    if ($zoom_crop == 3) {
        $final_height = $height * ($new_width / $width);
        if ($final_height > $new_height) {
            $new_width = $width * ($new_height / $height);
        } else {
            $new_height = $final_height;
        }
    }

    // create a new true color image
    $canvas = imagecreatetruecolor($new_width, $new_height);
    imagealphablending($canvas, false);

    // Create a new transparent color for image
    $color = imagecolorallocatealpha($canvas, 255, 255, 255, 127);

    // Completely fill the background of the new image with allocated color.
    imagefill($canvas, 0, 0, $color);

    // scale down and add borders
    if ($zoom_crop == 2) {
        $final_height = $height * ($new_width / $width);
        if ($final_height > $new_height) {
            $origin_x = $new_width / 2;
            $new_width = $width * ($new_height / $height);
            $origin_x = round($origin_x - ($new_width / 2));
        } else {
            $origin_y = $new_height / 2;
            $new_height = $final_height;
            $origin_y = round($origin_y - ($new_height / 2));
        }
    }

    // Restore transparency blending
    imagesavealpha($canvas, true);
    if ($zoom_crop > 0) {
        $src_x = $src_y = 0;
        $src_w = $width;
        $src_h = $height;
        $cmp_x = $width / $new_width;
        $cmp_y = $height / $new_height;

        // calculate x or y coordinate and width or height of source
        if ($cmp_x > $cmp_y) {
            $src_w = round($width / $cmp_x * $cmp_y);
            $src_x = round(($width - ($width / $cmp_x * $cmp_y)) / 2);
        } else if ($cmp_y > $cmp_x) {
            $src_h = round($height / $cmp_y * $cmp_x);
            $src_y = round(($height - ($height / $cmp_y * $cmp_x)) / 2);
        }

        // positional cropping!
        if (isset($align)) {
            if (strpos($align, 't') !== false) {
                $src_y = 0;
            }
            if (strpos($align, 'b') !== false) {
                $src_y = $height - $src_h;
            }
            if (strpos($align, 'l') !== false) {
                $src_x = 0;
            }
            if (strpos($align, 'r') !== false) {
                $src_x = $width - $src_w;
            }
        }
        imagecopyresampled($canvas, $image, $origin_x, $origin_y, $src_x, $src_y, $new_width, $new_height, $src_w, $src_h);
    } else {

        // copy and resize part of an image with resampling
        imagecopyresampled($canvas, $image, 0, 0, 0, 0, $new_width, $new_height, $width, $height);
    }
    $new_file = $file_name . '_' . $new_width . 'x' . $new_height . '.' . $image_ext;

    // SHOW THE NEW THUMB IMAGE
    if ($func == 'imagejpeg') $func($canvas, $folder . 'thumb/' . $new_file, 100);
    else $func($canvas, $folder . 'thumb/' . $new_file, floor(1 * 0.09));
    return $new_file;
}
if (!function_exists('fns_Rand_digit')) {
    function fns_Rand_digit($min, $max, $num) {
        $result = '';
        for ($i = 0; $i < $num; $i++) {
            $result.= rand($min, $max);
        }
        return $result;
    }
}
function delete_file($file) {
    if (file_exists($file)) {
        return @unlink($file);
    }
    else
        return FALSE;
}

/**
 * THONG BAO
 */
function success($mess = '') {
    $str = "";
    $str = "<script>";
    $str.= "alertify.success('$mess');";
    $str.= "</script>";
    $_SESSION['message'] = $str;
}

/**
 * THONG BAO
 */
function warning($mess = '') {
    $str = "";
    $str = "<script>";
    $str.= "alertify.warning('$mess');";
    $str.= "</script>";
    $_SESSION['message'] = $str;
}

/**
 * THONG BAO
 */
function info($mess = '') {
    $str = "";
    $str = "<script>";
    $str.= "alertify.success('$mess');";
    $str.= "</script>";
    $_SESSION['message'] = $str;
}

/**
 * THONG BAO
 */
function error($mess = '') {
    $str = "";
    $str = "<script>";
    $str.= "alertify.error('$mess');";
    $str.= "</script>";
    $_SESSION['message'] = $str;
}

/**
 *
 */
function message() {
    if (isset($_SESSION['message']) && !empty($_SESSION['message'])) {
        echo $_SESSION['message'];
        unset($_SESSION['message']);
    }
}
/**
 * STRING STRING STRING STRING STRING STRING STRING
 */
function limitWord($string, $maxOut)
{
    $string2Array = explode(' ', $string, ($maxOut + 1));
    if (count($string2Array) > $maxOut) {
        array_pop($string2Array);
        $output = implode(' ', $string2Array) . "...";
    } else {
        $output = $string;
    }
    return $output;
}


/*
    DOWNLOAD
*/

function get_actual_download_file($file)
{
    // Could be a normal download or a manual download file
    $possible_files = array($file => TRUE, "manual/$file" => FALSE); 
    
    // Find out what is the exact file requested 
    $found = FALSE;
    foreach ($possible_files as $name => $log) {
        if (@file_exists($_SERVER['DOCUMENT_ROOT'] . '/distributions/' . $name)) {
            $found = $name;
            break;
        }
    }

    return $found;
}
// Download a file from a mirror site
function download_file($mirror, $file)
{
    global $MYSITE;
    
    // Redirect to the particular file
    if (!headers_sent()) {
        status_header(302);
        header('Location: ' . $mirror . 'distributions/' . $file);
    } else {
        exit("Unable to serve you the requested file for download");
    }

    // Try to flush output, and make the browser really
    // download the file, even if the log server is down
    echo " ";
    flush();
}

/**
 * 404
 *
 * 
 */
function status_header($num)
{
    // Set status text
    switch ($num) {
        case 200: $status = "OK"; break;
        case 301: $status = "Moved Permanently"; break;
        case 302: $status = "Found"; break;
        case 404: $status = "Not Found"; break;
        default: return FALSE;
    }

    // Figure out HTTP protocol version - use 1.1 answer for 1.1 request,
    // answer with HTTP/1.0 for any other (ancient or futuristic) user
    switch (strtoupper($_SERVER['SERVER_PROTOCOL'])) {
        case 'HTTP/1.0':
            @header("HTTP/1.0 $num $status");
            break;

        case 'HTTP/1.1':
        default:
            @header("HTTP/1.1 $num $status");
            break;
    }
    
    // BC code for PHP < 4.3.0
    @header("Status: $num $status", TRUE, $num);
    
    return TRUE;
}