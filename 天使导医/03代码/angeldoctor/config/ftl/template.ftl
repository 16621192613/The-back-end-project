<!DOCTYPE html>
<html lang="zh-cmn-Hans">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=0">
        <meta name="format-detection" content="telephone=no" />
        <title>
            ${title}
        </title>
    </head>
    <style>
        body {
            min-height: calc(100vh - 30px);
            background: #fff;
            position: relative;
            margin: 0;
            padding: 15px;
        }
        .template-container {
            padding: 15px 0;
        }
        img {
            max-width: calc(100vw - 30px);
        }
        .template-qrcode-text {
            color: #4796f6;
            line-height: 30px;
            font-size: 14px;
            text-align: center

        }
        #template-qrcode{
            display: none;
        }
        .template-qrcode-container {
            margin-top: 20px;
            border-top: 1px solid #ccc;
            display: none;
            margin-bottom:25px;
        }
        .template-qrcode-img {
            width: 160px;
            height: 160px;
            margin: 0 auto 15px;
            text-align: center;
        }
        .template-qrcode-container img{
        	width: 160px;
        	height: 160px;
        }
        .template-name {
            font-size: 22px;
            font-weight: bold;
        }
        .template-authorAndTime {
            line-height: 30px;
            color: #666;
            font-size: 16px;
        }
        .template-time {
            margin-left: 16px;
        }
        .page-read-count {
            position: absolute;
            padding: 10px 0;
            text-align: center;
            color: #666;
            bottom: 0;
            font-size: 14px;
        }


    </style>
    <body>

    	<div class="template-name">
            ${title}
        </div>
        <p class="template-authorAndTime">
            <span>
                ${author}
            </span>
            <span class="template-time">
                ${createDate}
            </span>
        </p>
        <div class="template-container">
            ${content}
        </div>
        <div class="template-qrcode-container">
            <p class="template-qrcode-text">长按下方二维码<span style="color:#333">体验</span>天使导医</p>
            <div class="template-qrcode-img">
                <img id="template-image" src="">
            </div>
            <div id="template-qrcode"></div>
        </div>
        <div class="page-read-count">
            阅读量：<span id='pageRead'></span>
        </div>
        <script type='text/javascript' src='http://cdn.staticfile.org/jquery/2.1.1/jquery.min.js'></script>
        <script type="text/javascript" src="http://cdn.staticfile.org/jquery.qrcode/1.0/jquery.qrcode.min.js"></script>
        <script src="http://res.wx.qq.com/open/js/jweixin-1.2.0.js" ></script>
        <script type="text/javascript" src="./resource/js/util.js"></script>
        <script>
          var baseUrl = $.fn.baseUrl;
            function getParam1() {
                var reg = new RegExp("(^|&)" + "pageRead" + "=([^&]*)(&|$)", "i");
                var r = window.location.search.substr(1).match(reg);
                if (r!=null) {
                    $("#pageRead").html(r[2]);
                }
            }
            getParam1();
            function getParam() {
                var reg = new RegExp("(^|&)" + "id" + "=([^&]*)(&|$)", "i");
                var r = window.location.search.substr(1).match(reg);
                if (r!=null) {
                    var _id = r[2];

                    $.ajax({
                        type:"POST",
                        url: baseUrl + "/wechat/information/"+ _id +"/pageRead",
                        data: '',
                        contentType: "application/json",
                        success: function(result){},
                        error: function (res) {}
                    });
                }
            }
            getParam();

            var base64EncodeChars = "ABCDEFGHIJKLMNOPQ2RSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
            var base64DecodeChars = new Array(
                    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63,
                    52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1,
                    -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,
                    15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1,
                    -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                    41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1);
            //编码的方法
            function base64encode(str) {
                var out, i, len;
                var c1, c2, c3;
                len = str.length;
                i = 0;
                out = "";
                while (i < len) {
                    c1 = str.charCodeAt(i++) & 0xff;
                    if (i == len) {
                        out += base64EncodeChars.charAt(c1 >> 2);
                        out += base64EncodeChars.charAt((c1 & 0x3) << 4);
                        out += "==";
                        break;
                    }
                    c2 = str.charCodeAt(i++);
                    if (i == len) {
                        out += base64EncodeChars.charAt(c1 >> 2);
                        out += base64EncodeChars.charAt(((c1 & 0x3) << 4) | ((c2 & 0xF0) >> 4));
                        out += base64EncodeChars.charAt((c2 & 0xF) << 2);
                        out += "=";
                        break;
                    }
                    c3 = str.charCodeAt(i++);
                    out += base64EncodeChars.charAt(c1 >> 2);
                    out += base64EncodeChars.charAt(((c1 & 0x3) << 4) | ((c2 & 0xF0) >> 4));
                    out += base64EncodeChars.charAt(((c2 & 0xF) << 2) | ((c3 & 0xC0) >> 6));
                    out += base64EncodeChars.charAt(c3 & 0x3F);
                }
                return out;
            }
            //解码的方法
            function base64decode(str) {
                var c1, c2, c3, c4;
                var i, len, out;
                len = str.length;
                i = 0;
                out = "";
                while (i < len) {

                    do {
                        c1 = base64DecodeChars[str.charCodeAt(i++) & 0xff];
                    } while (i < len && c1 == -1);
                    if (c1 == -1)
                        break;

                    do {
                        c2 = base64DecodeChars[str.charCodeAt(i++) & 0xff];
                    } while (i < len && c2 == -1);
                    if (c2 == -1)
                        break;
                    out += String.fromCharCode((c1 << 2) | ((c2 & 0x30) >> 4));

                    do {
                        c3 = str.charCodeAt(i++) & 0xff;
                        if (c3 == 61)
                            return out;
                        c3 = base64DecodeChars[c3];
                    } while (i < len && c3 == -1);
                    if (c3 == -1)
                        break;
                    out += String.fromCharCode(((c2 & 0XF) << 4) | ((c3 & 0x3C) >> 2));

                    do {
                        c4 = str.charCodeAt(i++) & 0xff;
                        if (c4 == 61)
                            return out;
                        c4 = base64DecodeChars[c4];
                    } while (i < len && c4 == -1);
                    if (c4 == -1)
                        break;
                    out += String.fromCharCode(((c3 & 0x03) << 6) | c4);
                }
                return out;
            }
            function utf16to8(str) {
                var out, i, len, c;
                out = "";
                len = str.length;
                for (i = 0; i < len; i++) {
                    c = str.charCodeAt(i);
                    if ((c >= 0x0001) && (c <= 0x007F)) {
                        out += str.charAt(i);
                    } else if (c > 0x07FF) {
                        out += String.fromCharCode(0xE0 | ((c >> 12) & 0x0F));
                        out += String.fromCharCode(0x80 | ((c >> 6) & 0x3F));
                        out += String.fromCharCode(0x80 | ((c >> 0) & 0x3F));
                    } else {
                        out += String.fromCharCode(0xC0 | ((c >> 6) & 0x1F));
                        out += String.fromCharCode(0x80 | ((c >> 0) & 0x3F));
                    }
                }
                return out;
            }
            function utf8to16(str) {
                var out, i, len, c;
                var char2, char3;
                out = "";
                len = str.length;
                i = 0;
                while (i < len) {
                    c = str.charCodeAt(i++);
                    switch (c >> 4) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            // 0xxxxxxx
                            out += str.charAt(i - 1);
                            break;
                        case 12:
                        case 13:
                            // 110x xxxx   10xx xxxx
                            char2 = str.charCodeAt(i++);
                            out += String.fromCharCode(((c & 0x1F) << 6) | (char2 & 0x3F));
                            break;
                        case 14:
                            // 1110 xxxx  10xx xxxx  10xx xxxx
                            char2 = str.charCodeAt(i++);
                            char3 = str.charCodeAt(i++);
                            out += String.fromCharCode(((c & 0x0F) << 12) |
                                    ((char2 & 0x3F) << 6) |
                                    ((char3 & 0x3F) << 0));
                            break;
                    }
                }
                return out;
            }
            //得到当前网址的参数
            common_getParam();

            function common_getParam() {
                var reg = new RegExp("(^|&)" + "qrcode" + "=([^&]*)(&|$)", "i");
                var r = window.location.search.substr(1).match(reg);
                if (r!=null) {
                    var _src = utf8to16(base64decode(r[2]));
                    createQrcode(_src);
                    $(".template-qrcode-container").css("display","block");
                } else  {
                    $(".template-qrcode-container").css("display","none");
                }
            }
            function createQrcode(_src) {
                jQuery('#template-qrcode').qrcode({width: 180, height: 180, text: _src,foreground: "#4796f6",background: "#FFF"});
            }

            var image = document.getElementById("template-image");
            var canvas = document.getElementById("template-qrcode").getElementsByTagName("canvas")[0];
            if(canvas) {
                image.src = canvas.toDataURL("image/png");
            }
//获取openId 进行分享得积分
        var _openId;
        function getOpenId() {
            var reg = new RegExp("(^|&)" + "openId" + "=([^&]*)(&|$)", "i");
            var r = window.location.search.substr(1).match(reg);
            if (!!r) {
                _openId = r[2];
                getWxConfig()
            }
        }
        getOpenId();

        function getWxConfig() {
          var targetUrl = location.href.split('#')[0];
          targetUrl = targetUrl.replace(/\&/g,'%26');
          $.getJSON(baseUrl + "/openwechat/getConfig.htm?address=" + targetUrl, {}, function (data) {
                    if (data) {
                      var _signature = data.data;
                      wx_config = {
                        debug: false,
                        appId: _signature["appId"],
                        timestamp: _signature["timestamp"],
                        nonceStr: _signature["nonceStr"],
                        signature: _signature["signature"],
                        jsApiList: ['onMenuShareTimeline', 'onMenuShareAppMessage']
                    };
                    wx.config(wx_config);
                    var _shareInfo = {
                        title: '我要分享-天使导医',
                        link: location.href,
                        imgUrl: 'http://o9xcliak5.bkt.clouddn.com/icon.png',
                        desc: '天使导医，是云大夫网络科技（苏州）有限公司推出的一个踏实、靠谱、有情怀的医疗公益平台...',
                        success: function () {
                            console.log("分享成功");
                            shareArt();
                        },
                        cancel: function () {
//                            $.fn.topTip("取消分享文章",2000,'error');
                            console.log("取消分享")
                        }
                    };
                    wx.ready(function () {
                        wx.onMenuShareTimeline(_shareInfo);
                        wx.onMenuShareAppMessage(_shareInfo);
                    });
                }
            });

        }

        function shareArt() {
            $.ajax({
                type:"POST",
                url: baseUrl + "/wechat/acquireAccumulatePoints/share",
                contentType: "application/json",
                beforeSend: function(request) {
                    request.setRequestHeader("openId", _openId);
                },
                success: function(result){
                    console.log("获取积分成功")
                },
                error: function (result) {
                    console.log("获取积分失败")
                }
            });
        }





        </script>
    </body>
</html>
