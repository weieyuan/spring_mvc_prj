(function($){
	$.CStringUtil = function(){
		var self = this;
		
		this.format = function(str){
			if(arguments.length == 0){
				return null;
			}
			
			var oStr = arguments[0];
			for(var i=1; i<arguments.length; ++i){
				var reg = new RegExp("\\{" + (i-1) + "\\}", "gm");
				
				oStr = oStr.replace(reg, arguments[i]);
			}
			
			return oStr;
		}
	};
	
	$.CAjax = function(){
		var self = this;
		
		this.postJson = function(url, params, okCallBack, pokCallBack){
			
		};
		
		this.getJson = function(url, params, okCallBack, pokCallBack){
			var options = {
					url: url,
					type: "GET",
//					data: JSON.stringify(params),
					data: params,
					dateType: "json",
					contentType: "application/json",
					success: function(data){
						if(okCallBack){
							okCallBack(data);
						}
					},
					error: function(data){
						console.log("getJson: error");
						console.log(data);
						if(pokCallBack){
							pokCallBack(data);
						}
					}
			};
			
			$.ajax(options);
		};
		
		this.postJson = function(url, params, okCallBack, pokCallBack){
			var options = {
					url: url,
					type: "POST",
					data: JSON.stringify(params),
					dataType: "json",
					contentType: "application/json",
					success: function(data){
						if(okCallBack){
							okCallBack(data);
						}
					},
					error: function(data){
						console.log("postJson: error.");
						console.log(data);
						if(pokCallBack){
							pokCallBack(data);
						}
					}
			};
			$.ajax(options);
		};
	};
	
})(jQuery);
var CStringUtil = new $.CStringUtil();
var CAjax = new $.CAjax();