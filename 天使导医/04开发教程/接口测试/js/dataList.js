var paramList=[
	{
		code:"F00.00.00.01",
		content:"参数自动生成并且验证必输项以及输入的内容!",
		url:"http://localhost:8080/angeldoctor/testOne.htm",
		param:[
			{
				name:"userName",
				title:"用户账号",
				placeholder:"请输入英文",
				isRequired:true
			},{
				name:"password",
				title:"用户密码",
				placeholder:"用户密码",
				isRequired:true
			},{
				name:"phone",
				title:"手机号",
				placeholder:"只能输入数字",
				isRequired:true,
				dataType:"isInteger"
			},{
				name:"birthday",
				title:"出生日期",
				placeholder:"请输入YYYY-MM-DD 时间格式",
				isRequired:true,
				dataType:"isDate"
			},{
				name:"remark",
				placeholder:"字数不超过500字",
				title:"描述"
			}
		]
	},
	{
		code:"F00.00.00.02",
		content:"参数中带有list!",
		url:"",
		param:[
			{
				name:"userName",
				title:"用户账号",
				placeholder:"请输入英文",
				isRequired:true
			},{
				name:"password",
				title:"用户密码",
				placeholder:"用户密码",
				isRequired:true
			},{
				name:"phone",
				title:"手机号",
				placeholder:"只能输入数字",
				isRequired:true,
				dataType:"isInteger"
			},{
				name:"birthday",
				title:"出生日期",
				placeholder:"请输入YYYY-MM-DD 时间格式",
				isRequired:true,
				dataType:"isDate"
			},{
				name:"remark",
				placeholder:"字数不超过500字",
				title:"描述"
			},{
				isList:true,
				title:"宠物列表",
				name:"pet",
				param:[
					{
						name:"petName",
						title:"宠物名称",
						placeholder:"宠物名称",
						isRequired:true
					},{
						name:"petType",
						title:"宠物类型",
						placeholder:"宠物类型",
						isRequired:true
					},{
						name:"petNum",
						title:"宠物编号",
						placeholder:"请输入数字",
						isRequired:true,
						dataType:"isInteger"
					},{
						name:"petDate",
						title:"领养日期",
						placeholder:"请输入yyyy-MM-dd",
						isRequired:true,
						dataType:"isDate"
					},{
						name:"petRemark",
						title:"描述",
						placeholder:"不能超过500字",
					}
				]
			},{
				isList:true,
				title:"联系人列表",
				name:"connect",
				param:[
					{
						name:"conName",
						title:"联系人",
						placeholder:"联系人",
						isRequired:true
					},{
						name:"conTel",
						title:"联系电话",
						placeholder:"请输入数字",
						isRequired:true,
						dataType:"isInteger"
					},{
						name:"conEmail",
						title:"邮箱",
						placeholder:"请输入邮箱",
						isRequired:true,
						dataType:"isEmail"
					}
				]
			}
		]
	},
	{
		code:"F00.00.00.03",
		content:"参数中带有list!",
		url:"http://localhost:8080/angeldoctor/testList.htm",
		param:[
			{
				name:"userName",
				title:"用户账号",
				placeholder:"请输入英文",
				isRequired:true
			},{
				name:"password",
				title:"用户密码",
				placeholder:"用户密码",
				isRequired:true
			},{
				isList:true,
				title:"宠物列表",
				name:"petList",
				param:[
					{
						name:"petName",
						title:"宠物名称",
						placeholder:"宠物名称",
						isRequired:true
					},{
						name:"petType",
						title:"宠物类型",
						placeholder:"宠物类型",
						isRequired:true
					},{
						name:"petNum",
						title:"宠物编号",
						placeholder:"请输入数字",
						isRequired:true,
						dataType:"isInteger"
					},{
						name:"petRemark",
						title:"描述",
						placeholder:"不能超过500字",
					}
				]
			}
		]
	}
]
