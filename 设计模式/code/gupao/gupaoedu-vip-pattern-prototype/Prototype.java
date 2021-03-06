public void setParam(ExamPaperVo vo){
        ExamPaper examPaper = new ExamPaper();
		
		Method [] methods = examPaper.getMethods();
		for(Method m : methods ){
			if(m.getName().startWith("get")){
				Object value = m.invoke(vo,null);
				String targetMethodName = m.getName().replace("get");
				try{
				examPaper.getMethod(targetMethodName,).invoke(value);
				}catch(NosearchMethodException e){
					continue;
				}
			}
		}
		
        //试卷主键
        examPaper.setExaminationPaperId(vo.getExaminationPaperId());
        //剩余时间
        curForm.setLeavTime(examPaper.getLeavTime());
        //单位主键
        curForm.setOrganizationId(examPaper.getOrganizationId());
        //考试主键
        curForm.setId(examPaper.getId());
        //考场主键
        curForm.setExamroomId(examPaper.getExamroomId());
        //用户主键
        curForm.setUserId(examPaper.getUserId());
        //专业
        curForm.setSpecialtyCode(examPaper.getSpecialtyCode());
        //岗位
        curForm.setPostionCode(examPaper.getPostionCode());
        //等级
        curForm.setGradeCode(examPaper.getGradeCode());
        //考试开始时间
        curForm.setExamStartTime(examPaper.getExamStartTime());
        //考试结束时间
        curForm.setExamEndTime(examPaper.getExamEndTime());
        //单选题重要数量
        curForm.setSingleSelectionImpCount(examPaper.getSingleSelectionImpCount());
        //多选题重要数量
        curForm.setMultiSelectionImpCount(examPaper.getMultiSelectionImpCount());
        //判断题重要数量
        curForm.setJudgementImpCount(examPaper.getJudgementImpCount());
        //考试时间
        curForm.setExamTime(examPaper.getExamTime());
        //总分
        curForm.setFullScore(examPaper.getFullScore());
        //及格分
        curForm.setPassScore(examPaper.getPassScore());
        //学员姓名
        curForm.setUserName(examPaper.getUserName());
        //分数
        curForm.setScore(examPaper.getScore());
        //是否及格
        curForm.setResult(examPaper.getResult());
        curForm.setIsPassed(examPaper.getIsPassed());
        //单选答对数量
        curForm.setSingleOkCount(examPaper.getSingleOkCount());
        //多选答对数量
        curForm.setMultiOkCount(examPaper.getMultiOkCount());
        //判断答对数量
        curForm.setJudgementOkCount(examPaper.getJudgementOkCount());

        //提交试卷
        service.submit(examPaper);

}


//就是原型模式
BeanUtils.copy()
//
JSON.parseObject();
//Guava
//Copy 工具类