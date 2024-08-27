<template>
<view class="content">
	<view class="box" :style='{"minHeight":"100vh","width":"100%","padding":"120rpx 44rpx 244rpx 44rpx","background":"url(http://clfile.zggen.cn/20231123/c6d484065a734fe1846d30e79a9f9574.jpg) no-repeat center top / 100% 100%","height":"100%"}'>
		<view :style='{"padding":"0px 48rpx 40rpx 48rpx","boxShadow":"0px 0px 0px #dddddd","margin":"0 0 244rpx 0","borderRadius":"24rpx","background":"none","display":"block","width":"100%","position":"relative","height":"auto"}'>
			<image :style='{"width":"160rpx","margin":"0 0 40rpx 0","borderRadius":"100%","objectFit":"cover","display":"none","height":"80rpx"}' src="http://clfile.zggen.cn/20231027/f76234bafa534579beeb9a486c2d2df2.jpg" mode="aspectFill"></image>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<input :style='{"border":"2rpx solid #00000010","padding":"0px 24rpx 0 24rpx","margin":"0 0 0px 0","color":"#999999","borderRadius":"40rpx","background":"#00000040","width":"100%","fontSize":"28rpx","height":"80rpx"}'  v-model="ruleForm.yonghuzhanghao" type="text" class="uni-input" name="" placeholder="用户账号" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<input :style='{"border":"2rpx solid #00000010","padding":"0px 24rpx 0 24rpx","margin":"0 0 0px 0","color":"#999999","borderRadius":"40rpx","background":"#00000040","width":"100%","fontSize":"28rpx","height":"80rpx"}' v-model="ruleForm.mima" type="password" class="uni-input" name="" placeholder="密码" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<input :style='{"border":"2rpx solid #00000010","padding":"0px 24rpx 0 24rpx","margin":"0 0 0px 0","color":"#999999","borderRadius":"40rpx","background":"#00000040","width":"100%","fontSize":"28rpx","height":"80rpx"}' v-model="ruleForm.mima2" type="password" class="uni-input" name="" placeholder="确认密码" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<input :style='{"border":"2rpx solid #00000010","padding":"0px 24rpx 0 24rpx","margin":"0 0 0px 0","color":"#999999","borderRadius":"40rpx","background":"#00000040","width":"100%","fontSize":"28rpx","height":"80rpx"}'  v-model="ruleForm.yonghuming" type="text" class="uni-input" name="" placeholder="用户名" />
			</view>
			<picker :style='{"border":"2rpx solid #00000010","padding":"0 20rpx","margin":"0 0 24rpx 0","borderRadius":"40rpx","background":"#00000040","width":"100%","height":"auto"}' v-if="tableName=='yonghu'"  @change="yonghuxingbieChange" :value="yonghuxingbieIndex" :range="yonghuxingbieOptions">
				<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#999999"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
			</picker>
            <view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='yonghu'" @tap="yonghutouxiangTap" class="">
                <view>请上传头像</view>
                <image :style='{"width":"160rpx","borderRadius":"0px","objectFit":"contain","display":"block","height":"120rpx"}' v-if="ruleForm.touxiang" class="avator" :src="baseUrl+ruleForm.touxiang" mode=""></image>
                <image :style='{"width":"160rpx","borderRadius":"0px","objectFit":"contain","display":"block","height":"120rpx"}' v-else class="avator" src="../../static/gen/upload.png" mode=""></image>
            </view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<input :style='{"border":"2rpx solid #00000010","padding":"0px 24rpx 0 24rpx","margin":"0 0 0px 0","color":"#999999","borderRadius":"40rpx","background":"#00000040","width":"100%","fontSize":"28rpx","height":"80rpx"}'  v-model="ruleForm.lianxidianhua" type="text" class="uni-input" name="" placeholder="联系电话" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<input :style='{"border":"2rpx solid #00000010","padding":"0px 24rpx 0 24rpx","margin":"0 0 0px 0","color":"#999999","borderRadius":"40rpx","background":"#00000040","width":"100%","fontSize":"28rpx","height":"80rpx"}'  v-model="ruleForm.diqu" type="text" class="uni-input" name="" placeholder="地区" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='shangjia'" class="uni-form-item uni-column">
				<input :style='{"border":"2rpx solid #00000010","padding":"0px 24rpx 0 24rpx","margin":"0 0 0px 0","color":"#999999","borderRadius":"40rpx","background":"#00000040","width":"100%","fontSize":"28rpx","height":"80rpx"}'  v-model="ruleForm.shangjiazhanghao" type="text" class="uni-input" name="" placeholder="商家账号" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='shangjia'" class="uni-form-item uni-column">
				<input :style='{"border":"2rpx solid #00000010","padding":"0px 24rpx 0 24rpx","margin":"0 0 0px 0","color":"#999999","borderRadius":"40rpx","background":"#00000040","width":"100%","fontSize":"28rpx","height":"80rpx"}' v-model="ruleForm.mima" type="password" class="uni-input" name="" placeholder="密码" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='shangjia'" class="uni-form-item uni-column">
				<input :style='{"border":"2rpx solid #00000010","padding":"0px 24rpx 0 24rpx","margin":"0 0 0px 0","color":"#999999","borderRadius":"40rpx","background":"#00000040","width":"100%","fontSize":"28rpx","height":"80rpx"}' v-model="ruleForm.mima2" type="password" class="uni-input" name="" placeholder="确认密码" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='shangjia'" class="uni-form-item uni-column">
				<input :style='{"border":"2rpx solid #00000010","padding":"0px 24rpx 0 24rpx","margin":"0 0 0px 0","color":"#999999","borderRadius":"40rpx","background":"#00000040","width":"100%","fontSize":"28rpx","height":"80rpx"}'  v-model="ruleForm.dianpumingcheng" type="text" class="uni-input" name="" placeholder="店铺名称" />
			</view>
			<picker :style='{"border":"2rpx solid #00000010","padding":"0 20rpx","margin":"0 0 24rpx 0","borderRadius":"40rpx","background":"#00000040","width":"100%","height":"auto"}' v-if="tableName=='shangjia'"  @change="shangjiaxingbieChange" :value="shangjiaxingbieIndex" :range="shangjiaxingbieOptions">
				<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#999999"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
			</picker>
            <view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='shangjia'" @tap="shangjiadianputupianTap" class="">
                <view>请上传店铺图片</view>
                <image :style='{"width":"160rpx","borderRadius":"0px","objectFit":"contain","display":"block","height":"120rpx"}' v-if="ruleForm.dianputupian" class="avator" :src="baseUrl+ruleForm.dianputupian" mode=""></image>
                <image :style='{"width":"160rpx","borderRadius":"0px","objectFit":"contain","display":"block","height":"120rpx"}' v-else class="avator" src="../../static/gen/upload.png" mode=""></image>
            </view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='shangjia'" class="uni-form-item uni-column">
				<input :style='{"border":"2rpx solid #00000010","padding":"0px 24rpx 0 24rpx","margin":"0 0 0px 0","color":"#999999","borderRadius":"40rpx","background":"#00000040","width":"100%","fontSize":"28rpx","height":"80rpx"}'  v-model="ruleForm.shoujihaoma" type="text" class="uni-input" name="" placeholder="手机号码" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='shangjia'" class="uni-form-item uni-column">
				<input :style='{"border":"2rpx solid #00000010","padding":"0px 24rpx 0 24rpx","margin":"0 0 0px 0","color":"#999999","borderRadius":"40rpx","background":"#00000040","width":"100%","fontSize":"28rpx","height":"80rpx"}'  v-model="ruleForm.lianxiren" type="text" class="uni-input" name="" placeholder="联系人" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='shangjia'" class="uni-form-item uni-column">
				<input :style='{"border":"2rpx solid #00000010","padding":"0px 24rpx 0 24rpx","margin":"0 0 0px 0","color":"#999999","borderRadius":"40rpx","background":"#00000040","width":"100%","fontSize":"28rpx","height":"80rpx"}'  v-model="ruleForm.diqu" type="text" class="uni-input" name="" placeholder="地区" />
			</view>
			<button :style='{"border":"0","padding":"0 0 0 0","margin":"0 0 24rpx 0","color":"#ffffff","borderRadius":"60rpx","background":"#3da742","width":"100%","lineHeight":"80rpx","fontSize":"32rpx","height":"80rpx"}' class="btn-submit" @tap="register" type="primary">注册</button>
		</view>
	</view>
</view>
</template>

<script>
    import multipleSelect from "@/components/momo-multipleSelect/momo-multipleSelect";
	export default {
		data() {
			return {
                yonghuxingbieOptions: [],
                yonghuxingbieIndex: 0,
                shangjiaxingbieOptions: [],
                shangjiaxingbieIndex: 0,
				ruleForm: {
                yonghuzhanghao: '',
                mima: '',
                yonghuming: '',
                xingbie: '',
                touxiang: '',
                lianxidianhua: '',
                diqu: '',
                money: '',
                shangjiazhanghao: '',
                mima: '',
                dianpumingcheng: '',
                xingbie: '男',
                dianputupian: '',
                shoujihaoma: '',
                lianxiren: '',
                diqu: '',
                sfsh: '待审核',
                shhf: '',
				},
				tableName:""
			}
		},
        components: {
            multipleSelect
        },
        computed: {
            baseUrl() {
                return this.$base.url;
            },
        },
		async onLoad() {
			let res = [];
			let table = uni.getStorageSync("loginTable");
            this.tableName = table;

			// 自定义下拉框值
			if(this.tableName=='yonghu'){
                this.yonghuxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.yonghuxingbieOptions[0]
			}
			// 自定义下拉框值
			if(this.tableName=='shangjia'){
                this.shangjiaxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.shangjiaxingbieOptions[0]
			}
            if(`shangjia` == this.tableName){
                this.ruleForm.xingbie='男'
            }
            if(`shangjia` == this.tableName){
                this.ruleForm.sfsh='待审核'
            }
			
			this.styleChange()
		},
		methods: {

            // 下拉变化
            yonghuxingbieChange(e) {
                    this.yonghuxingbieIndex = e.target.value
                    this.ruleForm.xingbie = this.yonghuxingbieOptions[this.yonghuxingbieIndex]
            },
            yonghutouxiangTap() {
                let _this = this;
                this.$api.upload(function(res) {
                    _this.ruleForm.touxiang = 'file/' + res.file;
                    _this.$forceUpdate();
                });
            },
            // 下拉变化
            shangjiaxingbieChange(e) {
                    this.shangjiaxingbieIndex = e.target.value
                    this.ruleForm.xingbie = this.shangjiaxingbieOptions[this.shangjiaxingbieIndex]
            },
            shangjiadianputupianTap() {
                let _this = this;
                this.$api.upload(function(res) {
                    _this.ruleForm.dianputupian = 'file/' + res.file;
                    _this.$forceUpdate();
                });
            },
            toggleTab(str) {
                this.$refs[str].show();
            },

			styleChange() {
				this.$nextTick(()=>{
					document.querySelectorAll('.radioText').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"color":"#666666","display":"inline-block"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.radioTextActive').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"color":"#3da742","display":"inline-block"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.checkText').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"color":"#999999"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.checkTextActive').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"color":"#3da742"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.uni-radio-input').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"border":"2rpx solid #eeeeee","outlineColor":"#666666","background":"#ffffff","display":"inline-block"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.uni-radio-input-checked').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"border":"2rpx solid #3da742","textAlign":"center","background":"#3da742","display":"inline-block"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.uni-checkbox-input').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"border":"2rpx solid #eeeeee","borderColor":"#666666","borderRadius":"40rpx","background":"#ffffff"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.uni-checkbox-input-checked').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"borderColor":"#3da742","color":"#ffffff","borderRadius":"40rpx","background":"#3da742"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			// 注册
			async register() {
				if((!this.ruleForm.yonghuzhanghao) && `yonghu` == this.tableName){
					this.$utils.msg(`用户账号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `yonghu` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
                if(`yonghu` == this.tableName && (this.ruleForm.mima!=this.ruleForm.mima2)){
                    this.$utils.msg(`两次密码输入不一致`);
                    return
                }
				if((!this.ruleForm.yonghuming) && `yonghu` == this.tableName){
					this.$utils.msg(`用户名不能为空`);
					return
				}
				if(`yonghu` == this.tableName && this.ruleForm.lianxidianhua&&(!this.$validate.isMobile(this.ruleForm.lianxidianhua))){
					this.$utils.msg(`联系电话应输入手机格式`);
					return
				}
				if(`yonghu` == this.tableName && this.ruleForm.money&&(!this.$validate.isNumber(this.ruleForm.money))){
					this.$utils.msg(`余额应输入数字`);
					return
				}
				if((!this.ruleForm.shangjiazhanghao) && `shangjia` == this.tableName){
					this.$utils.msg(`商家账号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `shangjia` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
                if(`shangjia` == this.tableName && (this.ruleForm.mima!=this.ruleForm.mima2)){
                    this.$utils.msg(`两次密码输入不一致`);
                    return
                }
				if((!this.ruleForm.dianpumingcheng) && `shangjia` == this.tableName){
					this.$utils.msg(`店铺名称不能为空`);
					return
				}
				if((!this.ruleForm.shoujihaoma) && `shangjia` == this.tableName){
					this.$utils.msg(`手机号码不能为空`);
					return
				}
				if(`shangjia` == this.tableName && this.ruleForm.shoujihaoma&&(!this.$validate.isMobile(this.ruleForm.shoujihaoma))){
					this.$utils.msg(`手机号码应输入手机格式`);
					return
				}
				await this.$api.register(`${this.tableName}`, this.ruleForm);
				this.$utils.msgBack('注册成功');;
			}
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
</style>
