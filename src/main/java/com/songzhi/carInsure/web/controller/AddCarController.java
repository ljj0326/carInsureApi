package com.songzhi.carInsure.web.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.songzhi.carInsure.web.po.TCar;
import com.songzhi.carInsure.web.po.TCarExample;
import com.songzhi.carInsure.web.po.TCarExample.Criteria;
import com.songzhi.carInsure.web.po.TOrder;
import com.songzhi.carInsure.web.service.ToderService;
import com.songzhi.carInsure.web.util.BringIDUtil;
import com.songzhi.carInsure.web.vo.request.Head;
import com.songzhi.carInsure.web.vo.request.OrdBody;
import com.songzhi.carInsure.web.vo.request.RequestVo;
import com.songzhi.carInsure.web.vo.response.ResponseVO;

@Controller
@RequestMapping
public class AddCarController {

	@Resource
	private ToderService toderService;

	private static Logger logger = Logger.getLogger(AddCarController.class);

	@RequestMapping(value = "/api/userManager/addcar.do", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public ResponseVO addCar(@RequestBody RequestVo requestVo, HttpServletRequest request, HttpServletResponse response,
			HttpSession session) {
		OrdBody ordbody = requestVo.getOrdBody();
		Head head = requestVo.getHead();
		ResponseVO resVO = new ResponseVO();
		try {

			String issueCode = ordbody.getCbusinessBody().getIssue_code();
			String issue = ordbody.getCbusinessBody().getIssue();
			System.out.println("@@@@@@@@@@@@@@@@@@@");
			System.out.println(issue);
			if ("".equals(issue) || null == issue) {
				resVO.setResponseCode(1001);
				resVO.setResponseMsg("出单机构不能为空");

				return resVO;
			}
			// 接收渠道类型
			String inculdID = ordbody.getInclud_id();
			System.out.println(inculdID + "{{");

			String trenchCode = ordbody.getCbusinessBody().getTrench_code();
			String trench = ordbody.getCbusinessBody().getTrench();
			if ("".equals(trench) || null == trench) {
				resVO.setResponseCode(1002);
				resVO.setResponseMsg("渠道类型不能为空");

				return resVO;
			}
			// 接收业务来源
			String businessCode = ordbody.getCbusinessBody().getBusiness_code();
			String business = ordbody.getCbusinessBody().getBusiness();
			if ("".equals(business) || null == business) {
				resVO.setResponseCode(1003);
				resVO.setResponseMsg("业务来源不能为空");

				return resVO;
			}
			// 接收服务代码
			String serviceCode = ordbody.getCbusinessBody().getService_code();
			String service = ordbody.getCbusinessBody().getService();
			if ("".equals(service) || null == service) {
				resVO.setResponseCode(1004);
				resVO.setResponseMsg("服务代码不能为空");

				return resVO;
			}
			// 接收业务员
			String salesmanCode = ordbody.getCbusinessBody().getSalesman_code();
			String salesman = ordbody.getCbusinessBody().getSalesman();
			if ("".equals(salesman) || null == salesman) {
				resVO.setResponseCode(1005);
				resVO.setResponseMsg("业务员不能为空");

				return resVO;
			}
			// 接收录单员
			String catalogueCode = ordbody.getCbusinessBody().getCatalogue_code();

			String catalogue = ordbody.getCbusinessBody().getCatalogue();
			System.out.println(catalogueCode);
			System.out.println(catalogue);
			if ("".equals(catalogue) || null == catalogue) {
				resVO.setResponseCode(1006);
				resVO.setResponseMsg("录单员不能为空");

				return resVO;
			}
			// 接收代理点
			System.out.println("^^^^^^^^^");

			String agencyCode = ordbody.getCbusinessBody().getAgency_code();
			System.out.println("^^^^^^^^^");
			System.out.println(agencyCode);
			String agency = ordbody.getCbusinessBody().getAgency();
			System.out.println(agency);

			/* 车辆信息有效性判定 */
			String carNo = ordbody.getCcarBody().getCar_no();
			String vin = ordbody.getCcarBody().getVin();
			if ("".equals(vin) || null == vin) {
				resVO.setResponseCode(1011);
				resVO.setResponseMsg("车架号不能为空");

				return resVO;
			}

			System.out.println(carNo);

			System.out.println("2!!!!!!!!!");

			System.out.println(vin);
			String engineNo = ordbody.getCcarBody().getEngine_no();
			if ("".equals(engineNo) || null == engineNo) {
				resVO.setResponseCode(1012);
				resVO.setResponseMsg("发动机号不能为空");

				return resVO;
			}
			// 接收号牌类型
			String cPlateTypeCode = ordbody.getCcarBody().getC_plate_type_code();
			String cPlateType = ordbody.getCcarBody().getC_plate_type();

			Date tFstRegYm = ordbody.getCcarBody().getT_fst_reg_ym();
			if ("".equals(tFstRegYm) || null == tFstRegYm) {
				resVO.setResponseCode(1013);
				resVO.setResponseMsg("初登日期不能为空");

				return resVO;
			}
			// 接收车辆性质
			String cUsageCdeCode = ordbody.getCcarBody().getC_usage_cde_code();
			String cUsageCde = ordbody.getCcarBody().getC_usage_cde();
			// 接收营业性质
			String cOpenCdeCode = ordbody.getCcarBody().getC_open_cde_code();
			String cOpenCde = ordbody.getCcarBody().getC_open_cde();
			// 接收车辆类型
			String cCarTypeCode = ordbody.getCcarBody().getC_car_type_code();
			String cCarType = ordbody.getCcarBody().getC_car_type();
			// 接收细化车型
			String cRefineCode = ordbody.getCcarBody().getC_refine_code();
			String cRefine = ordbody.getCcarBody().getC_refine();
			// 接收行驶车辆类型
			String cDriTypCode = ordbody.getCcarBody().getC_dri_typ_code();
			String cDriTyp = ordbody.getCcarBody().getC__dri_typ();

			String cModelName = ordbody.getCcarBody().getC_fleet_mrk();
			if ("".equals(cModelName) || null == cModelName) {
				resVO.setResponseCode(1014);
				resVO.setResponseMsg("品牌型号不能为空");

				return resVO;
			}
			// 接收名称
			String fChinaName = ordbody.getCcarBody().getF_china_name();
			String cChinaName = ordbody.getCcarBody().getC_china_name();
			// 接收功率
			String nPower = ordbody.getCcarBody().getN_power();
			// 接收时间
			Date cMadeTime = ordbody.getCcarBody().getC_made_time();
			Date cGiveTime = ordbody.getCcarBody().getC_give_time();
			// 接收行驶里程
			String gRoadAway = ordbody.getCcarBody().getG_road_away();
			// 接收起保时间
			Date cFromTime = ordbody.getCcarBody().getC_from_time();
			Date cStartTime = ordbody.getCcarBody().getC_start_time();
			// 接收车龄
			String cUseYear = ordbody.getCcarBody().getC_use_year();
			String nDisplacement = ordbody.getCcarBody().getN_displacement();
			String nPoWeight = ordbody.getCcarBody().getN_po_weight();
			if ("".equals(nPoWeight) || null == nPoWeight) {
				resVO.setResponseCode(1015);
				resVO.setResponseMsg("整备质量只能是数字且不能为空或者零");

				return resVO;
			}
			// 接收载重量
			String nTonage = ordbody.getCcarBody().getN_tonage();
			String nLimitLoadPerson = ordbody.getCcarBody().getN_limit_load_person();
			System.out.println("))))(((((((((((((((");
			System.out.println(nLimitLoadPerson);
			if ("".equals(nLimitLoadPerson) || null == nLimitLoadPerson) {
				resVO.setResponseCode(1016);
				resVO.setResponseMsg("核定座位数不能为空");

				return resVO;
			}
			String cNewPurchaseValue = ordbody.getCcarBody().getC_new_purchase_value();
			if ("".equals(cNewPurchaseValue) || null == cNewPurchaseValue) {
				resVO.setResponseCode(1017);
				resVO.setResponseMsg("新车购置价不能为空");

				return resVO;
			}
			// 接收行业实际价值
			String nActualValue = ordbody.getCcarBody().getN_actual_value();
			String nDiscusUseval = ordbody.getCcarBody().getN_discus_useval();
			if ("".equals(nDiscusUseval) || null == nDiscusUseval) {
				resVO.setResponseCode(1018);
				resVO.setResponseMsg("协商实际价值不能为空");

				return resVO;
			}
			// 接收交管车辆种类
			String cChooseTypeCode = ordbody.getCcarBody().getC_choose_type_code();
			String cChooseType = ordbody.getCcarBody().getC_choose_type();
			// 接收能源类型code
			String cFuelTypeCode = ordbody.getCcarBody().getC_fuel_type_code();
			String cFuelType = ordbody.getCcarBody().getC_fuel_type();
			// 接收是否是否是外地车0:否，1：是
			Integer cProdPlace = ordbody.getCcarBody().getC_prod_place();
			// 收是否未还清贷款0否 1是
			Integer cRepay = ordbody.getCcarBody().getC_repay();
			String cPayYears = ordbody.getCcarBody().getC_pay_years();

			String cTransferMrk = ordbody.getCcarBody().getC_transfer_mrk();
			Date transferTime = ordbody.getCcarBody().getTransfer_time();
			/* if ("是".equals(cTransferMrk)) { */
			if (null == transferTime) {
				resVO.setResponseCode(1019);
				resVO.setResponseMsg("转移登记日期不能为空");
				return resVO;
			}
			// }
			// 接收是否验车0否 1是
			int isChecked = ordbody.getCcarBody().getIs_checked();
			// 验车人和时间
			String checker = ordbody.getCcarBody().getChecker();
			Date checkTime = ordbody.getCcarBody().getCheck_time();
			/*
			 * if(isChecked==1) { if ("".equals(checker) || null == checker) {
			 * resVO.setResponseCode(1020); resVO.setResponseMsg("验车人不能为空"); return resVO; }
			 * if (checkTime==null) { resVO.setResponseCode(1021);
			 * resVO.setResponseMsg("验车时间不能为空"); return resVO; }
			 * 
			 * }
			 */
			// 争议处理
			String cArgumentDeal = ordbody.getCcarBody().getC_argument_deal();
			Integer isNeedCheck = ordbody.getCcarBody().getIs_need_check();
			// 仲裁机构名称
			String courtName = ordbody.getCcarBody().getCourt_name();
			// 个团单标识
			String cPersonalMark = ordbody.getCcarBody().getC_personal_mark();
			// 车队号
			String cFleetMrk = ordbody.getCcarBody().getC_fleet_mrk();
			System.out.println("到了这里");
			// 车主
			String chezhuName = ordbody.getCchezhuBody().getChezhu_name();
			if ("".equals(chezhuName) || null == chezhuName) {
				resVO.setResponseCode(10);
				resVO.setResponseMsg("车主姓名不能为空");

				return resVO;
			}

			String chenzhuCardCode = ordbody.getCchezhuBody().getChenzhu_card_code();
			if ("".equals(chenzhuCardCode) || null == chenzhuCardCode) {
				resVO.setResponseCode(1022);
				resVO.setResponseMsg("证件类型Code不能为空");

				return resVO;
			}
			String credentialsType = ordbody.getCchezhuBody().getCredentials_Type();
			if ("".equals(credentialsType) || null == credentialsType) {
				resVO.setResponseCode(1023);
				resVO.setResponseMsg("证件类型不能为空");

				return resVO;
			}
			String credentials = ordbody.getCchezhuBody().getCredentials();
			if ("".equals(credentials) || null == credentials) {
				resVO.setResponseCode(1024);
				resVO.setResponseMsg("证件号码不能为空");

				return resVO;
			}
			String chezhuPhone = ordbody.getCchezhuBody().getChezhu_phone();
			if ("".equals(chezhuPhone) || null == chezhuPhone) {
				resVO.setResponseCode(1025);
				resVO.setResponseMsg("手机号码不能为空");

				return resVO;
			}
			System.out.println("haiemdn");
			String chezhuCode = ordbody.getCchezhuBody().getChezhu_code();
			if ("".equals(chezhuCode) || null == chezhuCode) {
				resVO.setResponseCode(1026);
				resVO.setResponseMsg("车主性质code不能为空");

				return resVO;
			}
			String chezhuCar = ordbody.getCchezhuBody().getChezhu_car();
			if ("".equals(chezhuCar) || null == chezhuCar) {
				resVO.setResponseCode(1027);
				resVO.setResponseMsg("车主性质不能为空");

				return resVO;
			}
			String customer = ordbody.getCchezhuBody().getCustomer();
			if ("".equals(customer) || null == customer) {
				resVO.setResponseCode(1028);
				resVO.setResponseMsg("客户分类不能为空");

				return resVO;
			}
			String customerCode = ordbody.getCchezhuBody().getCustomer_code();
			if ("".equals(customerCode) || null == customerCode) {
				resVO.setResponseCode(1029);
				resVO.setResponseMsg("客户分类code不能为空");

				return resVO;
			}
			String chezhuSex = ordbody.getCchezhuBody().getChezhu_sex_code();
			if ("".equals(chezhuSex) || null == chezhuSex) {
				resVO.setResponseCode(1030);
				resVO.setResponseMsg("性别不能为空");

				return resVO;
			}
			String chezhuAge = ordbody.getCchezhuBody().getChezhu_age();
			if ("".equals(chezhuAge) || null == chezhuAge) {
				resVO.setResponseCode(1031);
				resVO.setResponseMsg("年龄不能为空");

				return resVO;
			}
			String chezhuAgeCode = ordbody.getCchezhuBody().getChezhu_age_code();
			if ("".equals(chezhuAgeCode) || null == chezhuAgeCode) {
				resVO.setResponseCode(1032);
				resVO.setResponseMsg("年龄code不能为空");

				return resVO;
			}
			String chezhuEmali = ordbody.getCchezhuBody().getChezhu_emali();
			if ("".equals(chezhuEmali) || null == chezhuEmali) {
				resVO.setResponseCode(1033);
				resVO.setResponseMsg("邮箱不能为空");

				return resVO;
			}
			String chezhuLocation = ordbody.getCchezhuBody().getChezhu_location();
			if ("".equals(chezhuLocation) || null == chezhuLocation) {
				resVO.setResponseCode(1034);
				resVO.setResponseMsg("地址不能为空");

				return resVO;
			}
			String chezhuPostcode = ordbody.getCchezhuBody().getChezhu_postcode();
			if ("".equals(chezhuPostcode) || null == chezhuPostcode) {
				resVO.setResponseCode(1035);
				resVO.setResponseMsg("邮编不能为空");

				return resVO;
			}
			String chezhuSexCode = ordbody.getCchezhuBody().getChezhu_sex_code();
			if ("".equals(chezhuSexCode) || null == chezhuSexCode) {
				resVO.setResponseCode(1036);
				resVO.setResponseMsg("性别code不能为空");

				return resVO;
			}

			// 判断是否存在有效的暂存单 inculdID

			TOrder tOrder = null;
			if (!"".equals(inculdID) && null != inculdID && toderService.checkIncludeIDIsValid(inculdID) > 0) {
				// 存在时候，执行更新
				// 获取订单信息

				tOrder = toderService.getOrderByIncludeID(inculdID);

				// 业务流程
				tOrder.setIssue(issue);
				tOrder.setIssueCode(issueCode);
				tOrder.setTrench(trench);
				tOrder.setTrenchCode(trenchCode);
				tOrder.setBusiness(business);
				tOrder.setBusinessCode(businessCode);
				tOrder.setService(service);
				tOrder.setServiceCode(serviceCode);
				tOrder.setSalesman(salesman);
				tOrder.setSalesmanCode(salesmanCode);
				tOrder.setCatalogue(catalogue);
				tOrder.setCatalogueCode(catalogueCode);
				tOrder.setAgency(agency);
				tOrder.setAgencyCode(agencyCode);

				// 车主信息
				tOrder.setChezhuName(chezhuName);
				tOrder.setChenzhuCardCode(chenzhuCardCode);
				tOrder.setCredentialsType(credentialsType);
				tOrder.setCredentials(credentials);
				tOrder.setChezhuPhone(chezhuPhone);
				tOrder.setChezhuCode(chezhuCode);

				tOrder.setCustomer(customer);
				tOrder.setCustomerCode(customerCode);
				tOrder.setChezhuSex(chezhuSex);
				tOrder.setChezhuAge(chezhuAge);
				tOrder.setChezhuAgeCode(chezhuAgeCode);
				tOrder.setChezhuCar(chezhuCar);
				tOrder.setChezhuEmali(chezhuEmali);
				tOrder.setChezhuLocation(chezhuLocation);
				tOrder.setChezhuPostcode(chezhuPostcode);
				tOrder.setChezhuSexCode(chezhuSexCode);

				// 车辆
				tOrder.setVin(vin);
				tOrder.setEngineNo(engineNo);

				int toderInsert = toderService.updateOrder(tOrder);

				// TCar
				TCar tCar = new TCar();
				tCar.setcArgumentDeal(cArgumentDeal);
				tCar.setCarNo(carNo);
				tCar.setcCarType(cCarType);
				tCar.setcCarTypeCode(cCarTypeCode);
				tCar.setcChinaName(cChinaName);
				tCar.setcChooseType(cChooseType);
				tCar.setcChooseTypeCode(cChooseTypeCode);
				tCar.setcDriTyp(cDriTyp);
				tCar.setcDriTypCode(cDriTypCode);
				tCar.setcFleetMrk(cFleetMrk);
				tCar.setcFromTime(cFromTime);
				tCar.setcFuelType(cFuelType);
				tCar.setcGiveTime(cGiveTime);
				tCar.setChecker(checker);
				tCar.setCheckTime(checkTime);
				tCar.setcMadeTime(cMadeTime);
				tCar.setcModelName(cModelName);
				tCar.setcNewPurchaseValue(cNewPurchaseValue);
				tCar.setcOpenCde(cOpenCde);
				tCar.setcOpenCdeCode(cOpenCdeCode);
				tCar.setCourtName(courtName);
				tCar.setcPayYears(cPayYears);
				tCar.setcPersonalMark(cPersonalMark);
				tCar.setcPlateType(cPlateType);
				tCar.setcPlateTypeCode(cPlateTypeCode);
				tCar.setcProdPlace(cProdPlace);
				tCar.setcRefine(cRefine);
				tCar.setcRefineCode(cRefineCode);
				tCar.setcRepay(cRepay);
				tCar.setcStartTime(cStartTime);
				tCar.setcTransferMrk(cTransferMrk);
				tCar.setcUsageCde(cUsageCde);
				tCar.setcUsageCdeCode(cUsageCdeCode);
				tCar.setcUseYear(cUseYear);
				tCar.setEngineNo(engineNo);
				tCar.setfChinaName(fChinaName);
				tCar.setgRoadAway(gRoadAway);
				tCar.setIsChecked(isChecked);
				tCar.setIsNeedCheck(isNeedCheck);
				tCar.setnActualValue(nActualValue);
				tCar.setnDiscusUseval(nDiscusUseval);
				tCar.setnDisplacement(nDisplacement);
				tCar.setnLimitLoadPerson(nLimitLoadPerson);
				tCar.setnPoWeight(nPoWeight);
				tCar.setnPower(nPower);
				tCar.setnTonage(nTonage);
				tCar.settFstRegYm(tFstRegYm);
				tCar.setTransferTime(transferTime);
				tCar.setVin(vin);

				TCarExample example = new TCarExample();
				Criteria cri = example.createCriteria();
				cri.andOrderIdEqualTo(tOrder.getId());

				// 更新车辆信息表
				int tcarInsert = toderService.updateCar(tCar, example);

				if (toderInsert > 0 && tcarInsert > 0) {
					resVO.setResponseCode(1090);
					resVO.setResponseMsg("插入成功");

					// resVO.setResponseObj(userMap);
					return resVO;

				} else {

					resVO.setResponseCode(1080);
					resVO.setResponseMsg("插入失败");
					return resVO;
				}

			} else {
				// 不存在时，执行插入
				inculdID = BringIDUtil.bringTempID();
				tOrder = new TOrder();
				// 暂存id
				tOrder.setIncludId(inculdID);
				// 业务流程
				tOrder.setIssue(issue);
				tOrder.setIssueCode(issueCode);
				tOrder.setTrench(trench);
				tOrder.setTrenchCode(trenchCode);
				tOrder.setBusiness(business);
				tOrder.setBusinessCode(businessCode);
				tOrder.setService(service);
				tOrder.setServiceCode(serviceCode);
				tOrder.setSalesman(salesman);
				tOrder.setSalesmanCode(salesmanCode);
				tOrder.setCatalogue(catalogue);
				tOrder.setCatalogueCode(catalogueCode);
				tOrder.setAgency(agency);
				tOrder.setAgencyCode(agencyCode);

				// 车主信息
				tOrder.setChezhuName(chezhuName);
				tOrder.setChenzhuCardCode(chenzhuCardCode);
				tOrder.setCredentialsType(credentialsType);
				tOrder.setCredentials(credentials);
				tOrder.setChezhuPhone(chezhuPhone);
				tOrder.setChezhuCode(chezhuCode);

				tOrder.setCustomer(customer);
				tOrder.setCustomerCode(customerCode);
				tOrder.setChezhuSex(chezhuSex);
				tOrder.setChezhuAge(chezhuAge);
				tOrder.setChezhuAgeCode(chezhuAgeCode);
				tOrder.setChezhuCar(chezhuCar);
				tOrder.setChezhuEmali(chezhuEmali);
				tOrder.setChezhuLocation(chezhuLocation);
				tOrder.setChezhuPostcode(chezhuPostcode);
				tOrder.setChezhuSexCode(chezhuSexCode);
				// 车辆
				tOrder.setVin(vin);
				tOrder.setEngineNo(engineNo);

				// TCar
				TCar tCar = new TCar();
				tCar.setcArgumentDeal(cArgumentDeal);
				tCar.setCarNo(carNo);
				tCar.setcCarType(cCarType);
				tCar.setcCarTypeCode(cCarTypeCode);
				tCar.setcChinaName(cChinaName);
				tCar.setcChooseType(cChooseType);
				tCar.setcChooseTypeCode(cChooseTypeCode);
				tCar.setcDriTyp(cDriTyp);
				tCar.setcDriTypCode(cDriTypCode);
				tCar.setcFleetMrk(cFleetMrk);
				tCar.setcFromTime(cFromTime);
				tCar.setcFuelType(cFuelType);
				tCar.setcGiveTime(cGiveTime);
				tCar.setChecker(checker);
				tCar.setCheckTime(checkTime);
				tCar.setcMadeTime(cMadeTime);
				tCar.setcModelName(cModelName);
				tCar.setcNewPurchaseValue(cNewPurchaseValue);
				tCar.setcOpenCde(cOpenCde);
				tCar.setcOpenCdeCode(cOpenCdeCode);
				tCar.setCourtName(courtName);
				tCar.setcPayYears(cPayYears);
				tCar.setcPersonalMark(cPersonalMark);
				tCar.setcPlateType(cPlateType);
				tCar.setcPlateTypeCode(cPlateTypeCode);
				tCar.setcProdPlace(cProdPlace);
				tCar.setcRefine(cRefine);
				tCar.setcRefineCode(cRefineCode);
				tCar.setcRepay(cRepay);
				tCar.setcStartTime(cStartTime);
				tCar.setcTransferMrk(cTransferMrk);
				tCar.setcUsageCde(cUsageCde);
				tCar.setcUsageCdeCode(cUsageCdeCode);
				tCar.setcUseYear(cUseYear);
				tCar.setEngineNo(engineNo);
				tCar.setfChinaName(fChinaName);
				tCar.setgRoadAway(gRoadAway);
				tCar.setIsChecked(isChecked);
				tCar.setIsNeedCheck(isNeedCheck);
				tCar.setnActualValue(nActualValue);
				tCar.setnDiscusUseval(nDiscusUseval);
				tCar.setnDisplacement(nDisplacement);
				tCar.setnLimitLoadPerson(nLimitLoadPerson);
				tCar.setnPoWeight(nPoWeight);
				tCar.setnPower(nPower);
				tCar.setnTonage(nTonage);
				tCar.settFstRegYm(tFstRegYm);
				tCar.setTransferTime(transferTime);
				tCar.setVin(vin);

				int toderInsert = toderService.insert(tOrder);

				Integer ord_id = tOrder.getId();
				tCar.setOrderId(ord_id);

				int tCarInsert = toderService.insert(tCar);
				System.out.println(tCarInsert);

				if (toderInsert > 0 && tCarInsert > 0) {
					resVO.setResponseCode(1090);
					resVO.setResponseMsg("插入成功");

					// resVO.setResponseObj(userMap);
					return resVO;

				} else {

					resVO.setResponseCode(1080);
					resVO.setResponseMsg("插入失败");
					return resVO;
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			logger.debug(e);
			resVO.setResponseCode(1012);
			resVO.setResponseMsg("系统异常,注册失败");

			return resVO;
		}

	}
}
