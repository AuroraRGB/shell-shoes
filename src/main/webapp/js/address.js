//1. 初始化省份
function initProvince() {
    //定义省份数组
    var provinceArr = new Array("河北省", "山西省", "辽宁省", "吉林省", "河南省");
    //省份的select
    var provinceSel = document.getElementById("provinceSel");
    //初始化下拉列表选项的个数
    provinceSel.length = provinceArr.length + 1;  // 6
    //下拉列表中的内容 依次赋值
    for (var i = 0; i < provinceArr.length; i++) {  //[0] 1,2,3,4,5
        provinceSel.options[i + 1].text = provinceArr[i];
    }
}

//获得城市的select列表
//2. 初始化城市
function initCity(provinceSelect) {
    var citySel = document.getElementById("citySel");
    var hb_city = new Array("石家庄", "保定市", "秦皇岛", "唐山市", "邯郸市", "邢台市", "沧州市", "承德市", "廊坊市", "衡水市", "张家口");
    var sx_city = new Array(" 太原市", "大同市", "阳泉市", "长治市", "临汾市");
    var ln_city = new Array("盘锦市", "鞍山市", "抚顺市", "本溪市", "铁岭市", "锦州市", "丹东市");
    var jl_city = new Array("吉林市", "通化市 ", "白城市", " 四平市", "辽源市", "松原市", "白山市");
    var hn_city = new Array("郑州市", "洛阳市", "焦作市", "商丘市", "信阳市");

    // (1)获得选中的省份下标 （"河北省", 1）
    var provinceIndex = provinceSelect.selectedIndex;
    // 封装： switch -case  function initCityValue(城市select控件，对应城市数组 )

    switch (provinceIndex) {
        case 1:
            initCityValue(hb_city);
            break;
        case 2:
            initCityValue(sx_city);
            break;
        case 3:
            initCityValue(ln_city);
            break;
        case 4:
            initCityValue(jl_city);
            break;
        case 5:
            initCityValue(hn_city);
            break;
    }
}


/**
 * citySel: 城市select控件，
 * cityArray :对应城市数组
 */

function initCityValue(cityArray) {
    var citySel = document.getElementById("citySel");

    citySel.length = cityArray.length + 1;
    for (var i = 0; i < cityArray.length; i++) {
        citySel.options[i + 1].text = cityArray[i];
    }
}
