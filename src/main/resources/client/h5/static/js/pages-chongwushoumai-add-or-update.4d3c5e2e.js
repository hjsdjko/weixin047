(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-chongwushoumai-add-or-update"],{2119:function(e,i,r){"use strict";r.r(i);var t=r("6654"),n=r("dd6d");for(var o in n)"default"!==o&&function(e){r.d(i,e,(function(){return n[e]}))}(o);r("4e9a");var a,u=r("f0c5"),s=Object(u["a"])(n["default"],t["b"],t["c"],!1,null,"34caefb9",null,!1,t["a"],a);i["default"]=s.exports},"4e9a":function(e,i,r){"use strict";var t=r("e6df"),n=r.n(t);n.a},5387:function(e,i,r){"use strict";var t=r("4ea4");Object.defineProperty(i,"__esModule",{value:!0}),i.default=void 0,r("a481"),r("c5f6"),r("f559"),r("456d"),r("ac6a"),r("28a5"),r("96cf");var n=t(r("3b8d")),o=t(r("e2b1")),a=t(r("064f")),u=t(r("bd56")),s={data:function(){return{cross:"",ruleForm:{chongwumingcheng:"",chongwutupian:"",chongwupinzhong:"",chongwuxingbie:"",chongwunianling:"",chongwuxiangqing:"",chongwuzhuangtai:"售罄",storeupnum:"0",price:"0",shangjiazhanghao:"",dianpumingcheng:"",diqu:""},chongwuxingbieOptions:[],chongwuxingbieIndex:0,chongwuzhuangtaiOptions:[],chongwuzhuangtaiIndex:0,user:{},ro:{chongwumingcheng:!1,chongwutupian:!1,chongwupinzhong:!1,chongwuxingbie:!1,chongwunianling:!1,chongwuxiangqing:!1,chongwuzhuangtai:!1,storeupnum:!1,price:!1,shangjiazhanghao:!1,dianpumingcheng:!1,diqu:!1,clicktime:!1}}},components:{wPicker:o.default,xiaEditor:a.default,multipleSelect:u.default},watch:{},onLoad:function(){var e=(0,n.default)(regeneratorRuntime.mark((function e(i){var r,t,n,o;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return r=uni.getStorageSync("nowTable"),e.next=3,this.$api.session(r);case 3:if(t=e.sent,this.user=t.data,this.ruleForm.shangjiazhanghao=this.user.shangjiazhanghao,this.ro.shangjiazhanghao=!0,this.ruleForm.dianpumingcheng=this.user.dianpumingcheng,this.ro.dianpumingcheng=!0,this.ruleForm.diqu=this.user.diqu,this.ro.diqu=!0,this.chongwuxingbieOptions="公,母".split(","),this.chongwuzhuangtaiOptions="在售,售罄".split(","),this.ruleForm.userid=uni.getStorageSync("userid"),i.refid&&(this.ruleForm.refid=i.refid,this.ruleForm.nickname=uni.getStorageSync("nickname")),!i.id){e.next=21;break}return this.ruleForm.id=i.id,e.next=19,this.$api.info("chongwushoumai",this.ruleForm.id);case 19:t=e.sent,this.ruleForm=t.data;case 21:if(this.cross=i.cross,!i.cross){e.next=81;break}n=uni.getStorageSync("crossObj"),e.t0=regeneratorRuntime.keys(n);case 25:if((e.t1=e.t0()).done){e.next=81;break}if(o=e.t1.value,"chongwumingcheng"!=o){e.next=31;break}return this.ruleForm.chongwumingcheng=n[o],this.ro.chongwumingcheng=!0,e.abrupt("continue",25);case 31:if("chongwutupian"!=o){e.next=35;break}return this.ruleForm.chongwutupian=n[o].split(",")[0],this.ro.chongwutupian=!0,e.abrupt("continue",25);case 35:if("chongwupinzhong"!=o){e.next=39;break}return this.ruleForm.chongwupinzhong=n[o],this.ro.chongwupinzhong=!0,e.abrupt("continue",25);case 39:if("chongwuxingbie"!=o){e.next=43;break}return this.ruleForm.chongwuxingbie=n[o],this.ro.chongwuxingbie=!0,e.abrupt("continue",25);case 43:if("chongwunianling"!=o){e.next=47;break}return this.ruleForm.chongwunianling=n[o],this.ro.chongwunianling=!0,e.abrupt("continue",25);case 47:if("chongwuxiangqing"!=o){e.next=51;break}return this.ruleForm.chongwuxiangqing=n[o],this.ro.chongwuxiangqing=!0,e.abrupt("continue",25);case 51:if("chongwuzhuangtai"!=o){e.next=55;break}return this.ruleForm.chongwuzhuangtai=n[o],this.ro.chongwuzhuangtai=!0,e.abrupt("continue",25);case 55:if("storeupnum"!=o){e.next=59;break}return this.ruleForm.storeupnum=n[o],this.ro.storeupnum=!0,e.abrupt("continue",25);case 59:if("price"!=o){e.next=63;break}return this.ruleForm.price=n[o],this.ro.price=!0,e.abrupt("continue",25);case 63:if("shangjiazhanghao"!=o){e.next=67;break}return this.ruleForm.shangjiazhanghao=n[o],this.ro.shangjiazhanghao=!0,e.abrupt("continue",25);case 67:if("dianpumingcheng"!=o){e.next=71;break}return this.ruleForm.dianpumingcheng=n[o],this.ro.dianpumingcheng=!0,e.abrupt("continue",25);case 71:if("diqu"!=o){e.next=75;break}return this.ruleForm.diqu=n[o],this.ro.diqu=!0,e.abrupt("continue",25);case 75:if("clicktime"!=o){e.next=79;break}return this.ruleForm.clicktime=n[o],this.ro.clicktime=!0,e.abrupt("continue",25);case 79:e.next=25;break;case 81:this.styleChange(),this.$forceUpdate();case 83:case"end":return e.stop()}}),e,this)})));function i(i){return e.apply(this,arguments)}return i}(),methods:{chongwuxiangqingChange:function(e){this.ruleForm.chongwuxiangqing=e},styleChange:function(){this.$nextTick((function(){document.querySelectorAll(".radioText").forEach((function(e){e.removeAttribute("style");var i={color:"#666666"};Object.keys(i).forEach((function(r){e.style[r]=i[r]}))})),document.querySelectorAll(".radioTextActive").forEach((function(e){e.removeAttribute("style");var i={color:"#3da742"};Object.keys(i).forEach((function(r){e.style[r]=i[r]}))})),document.querySelectorAll(".checkText").forEach((function(e){e.removeAttribute("style");var i={color:"#666666"};Object.keys(i).forEach((function(r){e.style[r]=i[r]}))})),document.querySelectorAll(".checkTextActive").forEach((function(e){e.removeAttribute("style");var i={color:"#3da742"};Object.keys(i).forEach((function(r){e.style[r]=i[r]}))})),document.querySelectorAll(".uni-radio-input").forEach((function(e){e.removeAttribute("style");var i={border:"2rpx solid #999999",borderRadius:"100%",background:"#ffffff"};Object.keys(i).forEach((function(r){e.style[r]=i[r]}))})),document.querySelectorAll(".uni-radio-input-checked").forEach((function(e){e.removeAttribute("style");var i={border:"2rpx solid #3da742",borderRadius:"100%",background:"#3da742"};Object.keys(i).forEach((function(r){e.style[r]=i[r]}))})),document.querySelectorAll(".uni-checkbox-input").forEach((function(e){e.removeAttribute("style");var i={border:"2rpx solid #999999",borderRadius:"100%",background:"#ffffff"};Object.keys(i).forEach((function(r){e.style[r]=i[r]}))})),document.querySelectorAll(".uni-checkbox-input-checked").forEach((function(e){e.removeAttribute("style");var i={border:"2rpx solid #3da742",color:"#ffffff",borderRadius:"100%",background:"#3da742"};Object.keys(i).forEach((function(r){e.style[r]=i[r]}))}))}))},clicktimeConfirm:function(e){console.log(e),this.ruleForm.clicktime=e.result,this.$forceUpdate()},chongwuxingbieChange:function(e){this.chongwuxingbieIndex=e.target.value,this.ruleForm.chongwuxingbie=this.chongwuxingbieOptions[this.chongwuxingbieIndex]},chongwuzhuangtaiChange:function(e){this.chongwuzhuangtaiIndex=e.target.value,this.ruleForm.chongwuzhuangtai=this.chongwuzhuangtaiOptions[this.chongwuzhuangtaiIndex]},chongwutupianTap:function(){var e=this;this.$api.upload((function(i){e.ruleForm.chongwutupian="file/"+i.file,e.$forceUpdate(),e.$nextTick((function(){e.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var e=(0,n.default)(regeneratorRuntime.mark((function e(){var i,r,t,n,o,a,u,s,c,l;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(this.ruleForm.chongwumingcheng){e.next=3;break}return this.$utils.msg("宠物名称不能为空"),e.abrupt("return");case 3:if(this.ruleForm.chongwuxingbie){e.next=6;break}return this.$utils.msg("宠物性别不能为空"),e.abrupt("return");case 6:if(!this.ruleForm.chongwunianling||this.$validate.isIntNumer(this.ruleForm.chongwunianling)){e.next=9;break}return this.$utils.msg("宠物年龄应输入整数"),e.abrupt("return");case 9:if(!this.ruleForm.storeupnum||this.$validate.isIntNumer(this.ruleForm.storeupnum)){e.next=12;break}return this.$utils.msg("收藏数量应输入整数"),e.abrupt("return");case 12:if(!this.ruleForm.price||this.$validate.isNumber(this.ruleForm.price)){e.next=15;break}return this.$utils.msg("价格应输入数字"),e.abrupt("return");case 15:if(this.ruleForm.shangjiazhanghao){e.next=18;break}return this.$utils.msg("商家账号不能为空"),e.abrupt("return");case 18:if(this.ruleForm.dianpumingcheng){e.next=21;break}return this.$utils.msg("店铺名称不能为空"),e.abrupt("return");case 21:if(this.ruleForm.diqu){e.next=24;break}return this.$utils.msg("地区不能为空"),e.abrupt("return");case 24:if(!this.cross){e.next=41;break}if(uni.setStorageSync("crossCleanType",!0),o=uni.getStorageSync("statusColumnName"),a=uni.getStorageSync("statusColumnValue"),""==o){e.next=41;break}if(i||(i=uni.getStorageSync("crossObj")),o.startsWith("[")){e.next=37;break}for(u in i)u==o&&(i[u]=a);return s=uni.getStorageSync("crossTable"),e.next=35,this.$api.update("".concat(s),i);case 35:e.next=41;break;case 37:r=Number(uni.getStorageSync("userid")),t=i["id"],n=uni.getStorageSync("statusColumnName"),n=n.replace(/\[/,"").replace(/\]/,"");case 41:if(!t||!r){e.next=64;break}return this.ruleForm.crossuserid=r,this.ruleForm.crossrefid=t,c={page:1,limit:10,crossuserid:r,crossrefid:t},e.next=47,this.$api.list("chongwushoumai",c);case 47:if(l=e.sent,!(l.data.total>=n)){e.next=54;break}return this.$utils.msg(uni.getStorageSync("tips")),uni.removeStorageSync("crossCleanType"),e.abrupt("return",!1);case 54:if(!this.ruleForm.id){e.next=59;break}return e.next=57,this.$api.update("chongwushoumai",this.ruleForm);case 57:e.next=61;break;case 59:return e.next=61,this.$api.add("chongwushoumai",this.ruleForm);case 61:this.$utils.msgBack("提交成功");case 62:e.next=72;break;case 64:if(!this.ruleForm.id){e.next=69;break}return e.next=67,this.$api.update("chongwushoumai",this.ruleForm);case 67:e.next=71;break;case 69:return e.next=71,this.$api.add("chongwushoumai",this.ruleForm);case 71:this.$utils.msgBack("提交成功");case 72:case"end":return e.stop()}}),e,this)})));function i(){return e.apply(this,arguments)}return i}(),optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var i=new Date,r=i.getFullYear(),t=i.getMonth()+1,n=i.getDate();return"start"===e?r-=60:"end"===e&&(r+=2),t=t>9?t:"0"+t,n=n>9?n:"0"+n,"".concat(r,"-").concat(t,"-").concat(n)},toggleTab:function(e){this.$refs[e].show()}}};i.default=s},6654:function(e,i,r){"use strict";var t={"xia-editor":r("064f").default,"w-picker":r("e2b1").default},n=function(){var e=this,i=e.$createElement,r=e._self._c||i;return r("v-uni-view",{staticClass:"content"},[r("v-uni-view",{style:{width:"100%",padding:"0 0 0 0",position:"relative",background:"#ffffff",height:"100%"}},[r("v-uni-form",{staticClass:"app-update-pv",style:{width:"100%",padding:"24rpx 24rpx 24rpx 24rpx",background:"#ffffff",display:"block",height:"auto"}},[r("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"#ffffff",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("宠物名称")]),r("v-uni-input",{style:{border:"0px solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"8rpx",flex:"1",background:"#ffffff00",fontSize:"28rpx",lineHeight:"80rpx",height:"80rpx"},attrs:{disabled:e.ro.chongwumingcheng,placeholder:"宠物名称"},model:{value:e.ruleForm.chongwumingcheng,callback:function(i){e.$set(e.ruleForm,"chongwumingcheng",i)},expression:"ruleForm.chongwumingcheng"}})],1),r("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"#ffffff",display:"flex",width:"100%",borderStyle:"solid",height:"auto"},on:{click:function(i){arguments[0]=i=e.$handleEvent(i),e.chongwutupianTap.apply(void 0,arguments)}}},[r("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("宠物图片")]),e.ruleForm.chongwutupian?r("v-uni-image",{staticClass:"avator",style:{width:"80rpx",borderRadius:"100%",objectFit:"cover",display:"block",height:"80rpx"},attrs:{src:e.baseUrl+e.ruleForm.chongwutupian.split(",")[0],mode:"aspectFill"}}):r("v-uni-image",{staticClass:"avator",style:{width:"80rpx",borderRadius:"100%",objectFit:"cover",display:"block",height:"80rpx"},attrs:{src:"../../static/gen/upload.png",mode:"aspectFill"}})],1),r("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"#ffffff",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("宠物品种")]),r("v-uni-input",{style:{border:"0px solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"8rpx",flex:"1",background:"#ffffff00",fontSize:"28rpx",lineHeight:"80rpx",height:"80rpx"},attrs:{disabled:e.ro.chongwupinzhong,placeholder:"宠物品种"},model:{value:e.ruleForm.chongwupinzhong,callback:function(i){e.$set(e.ruleForm,"chongwupinzhong",i)},expression:"ruleForm.chongwupinzhong"}})],1),r("v-uni-view",{staticClass:"select",style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"#ffffff",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("宠物性别")]),r("v-uni-picker",{style:{width:"100%",flex:"1",height:"auto"},attrs:{value:e.chongwuxingbieIndex,range:e.chongwuxingbieOptions},on:{change:function(i){arguments[0]=i=e.$handleEvent(i),e.chongwuxingbieChange.apply(void 0,arguments)}}},[r("v-uni-view",{staticClass:"uni-input",style:{width:"100%",lineHeight:"80rpx",fontSize:"28rpx",color:"#666666"}},[e._v(e._s(e.ruleForm.chongwuxingbie?e.ruleForm.chongwuxingbie:"请选择宠物性别"))])],1)],1),r("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"#ffffff",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("宠物年龄")]),r("v-uni-input",{style:{border:"0px solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"8rpx",flex:"1",background:"#ffffff00",fontSize:"28rpx",lineHeight:"80rpx",height:"80rpx"},attrs:{disabled:e.ro.chongwunianling,placeholder:"宠物年龄"},model:{value:e.ruleForm.chongwunianling,callback:function(i){e.$set(e.ruleForm,"chongwunianling",i)},expression:"ruleForm.chongwunianling"}})],1),r("v-uni-view",{staticClass:"select",style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"#ffffff",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("宠物状态")]),r("v-uni-picker",{style:{width:"100%",flex:"1",height:"auto"},attrs:{value:e.chongwuzhuangtaiIndex,range:e.chongwuzhuangtaiOptions},on:{change:function(i){arguments[0]=i=e.$handleEvent(i),e.chongwuzhuangtaiChange.apply(void 0,arguments)}}},[r("v-uni-view",{staticClass:"uni-input",style:{width:"100%",lineHeight:"80rpx",fontSize:"28rpx",color:"#666666"}},[e._v(e._s(e.ruleForm.chongwuzhuangtai?e.ruleForm.chongwuzhuangtai:"请选择宠物状态"))])],1)],1),r("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"#ffffff",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("收藏数量")]),r("v-uni-input",{style:{border:"0px solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"8rpx",flex:"1",background:"#ffffff00",fontSize:"28rpx",lineHeight:"80rpx",height:"80rpx"},attrs:{disabled:e.ro.storeupnum,placeholder:"收藏数量"},model:{value:e.ruleForm.storeupnum,callback:function(i){e.$set(e.ruleForm,"storeupnum",i)},expression:"ruleForm.storeupnum"}})],1),r("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"#ffffff",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("价格")]),r("v-uni-input",{style:{border:"0px solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"8rpx",flex:"1",background:"#ffffff00",fontSize:"28rpx",lineHeight:"80rpx",height:"80rpx"},attrs:{disabled:e.ro.price,placeholder:"价格"},model:{value:e.ruleForm.price,callback:function(i){e.$set(e.ruleForm,"price",i)},expression:"ruleForm.price"}})],1),r("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"#ffffff",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("商家账号")]),r("v-uni-input",{style:{border:"0px solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"8rpx",flex:"1",background:"#ffffff00",fontSize:"28rpx",lineHeight:"80rpx",height:"80rpx"},attrs:{disabled:e.ro.shangjiazhanghao,placeholder:"商家账号"},model:{value:e.ruleForm.shangjiazhanghao,callback:function(i){e.$set(e.ruleForm,"shangjiazhanghao",i)},expression:"ruleForm.shangjiazhanghao"}})],1),r("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"#ffffff",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("店铺名称")]),r("v-uni-input",{style:{border:"0px solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"8rpx",flex:"1",background:"#ffffff00",fontSize:"28rpx",lineHeight:"80rpx",height:"80rpx"},attrs:{disabled:e.ro.dianpumingcheng,placeholder:"店铺名称"},model:{value:e.ruleForm.dianpumingcheng,callback:function(i){e.$set(e.ruleForm,"dianpumingcheng",i)},expression:"ruleForm.dianpumingcheng"}})],1),r("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"#ffffff",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("地区")]),r("v-uni-input",{style:{border:"0px solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"8rpx",flex:"1",background:"#ffffff00",fontSize:"28rpx",lineHeight:"80rpx",height:"80rpx"},attrs:{disabled:e.ro.diqu,placeholder:"地区"},model:{value:e.ruleForm.diqu,callback:function(i){e.$set(e.ruleForm,"diqu",i)},expression:"ruleForm.diqu"}})],1),r("v-uni-view",{style:{padding:"12rpx 0 12rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",borderWidth:"0 0 2rpx 0",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"100%",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",fontWeight:"500"}},[e._v("宠物详情")]),r("xia-editor",{ref:"editor",style:{minHeight:"300rpx",border:"0px solid #efefef",padding:"0px",color:"#666666",borderRadius:"8rpx 0 0 8rpx",background:"#ffffff",width:"100%",height:"auto"},attrs:{placeholder:"宠物详情"},on:{editorChange:function(i){arguments[0]=i=e.$handleEvent(i),e.chongwuxiangqingChange.apply(void 0,arguments)}},model:{value:e.ruleForm.chongwuxiangqing,callback:function(i){e.$set(e.ruleForm,"chongwuxiangqing",i)},expression:"ruleForm.chongwuxiangqing"}})],1),r("v-uni-view",{staticClass:"btn",style:{width:"100%",justifyContent:"center",display:"flex",height:"auto"}},[r("v-uni-button",{staticClass:"bg-red",style:{border:"0px solid #eeeeee",padding:"0 0 0 0",margin:"0 4% 0 0",color:"#ffffff",background:"#3da742",width:"30%",lineHeight:"80rpx",fontSize:"28rpx",height:"80rpx"},on:{click:function(i){arguments[0]=i=e.$handleEvent(i),e.onSubmitTap.apply(void 0,arguments)}}},[e._v("提交")])],1)],1),r("w-picker",{ref:"clicktime",attrs:{mode:"dateTime",step:"1",current:!1,hasSecond:!1,themeColor:"#333333"},on:{confirm:function(i){arguments[0]=i=e.$handleEvent(i),e.clicktimeConfirm.apply(void 0,arguments)}}})],1)],1)},o=[];r.d(i,"b",(function(){return n})),r.d(i,"c",(function(){return o})),r.d(i,"a",(function(){return t}))},a687:function(e,i,r){var t=r("24fb");i=t(!1),i.push([e.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.content[data-v-34caefb9]{min-height:calc(100vh - 44px);box-sizing:border-box}',""]),e.exports=i},dd6d:function(e,i,r){"use strict";r.r(i);var t=r("5387"),n=r.n(t);for(var o in t)"default"!==o&&function(e){r.d(i,e,(function(){return t[e]}))}(o);i["default"]=n.a},e6df:function(e,i,r){var t=r("a687");"string"===typeof t&&(t=[[e.i,t,""]]),t.locals&&(e.exports=t.locals);var n=r("4f06").default;n("afb84de2",t,!0,{sourceMap:!1,shadowMode:!1})}}]);