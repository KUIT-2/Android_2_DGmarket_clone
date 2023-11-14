package com.example.carrotmarket

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.carrotmarket.databinding.FragmentExerciseAlarmBinding

class ExerciseAlarmFragment : Fragment() {

    private lateinit var binding : FragmentExerciseAlarmBinding
    private var exerciseAdapter : ExerciseAlarmAdapter?= null
    private var exerciseList : ArrayList<ExerciseAlarmDataClass> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentExerciseAlarmBinding.inflate(layoutInflater)

        initExerciseRecyclerView()
        initInfoExample()
        return binding.root
    }

    private fun initInfoExample() {
        exerciseList.addAll(
            arrayListOf(
                ExerciseAlarmDataClass("황졍민님, 아직 당근마켓 새 이름을 모르시나요?","새로워진 당신 근처의 당근을 만나보세요","하루 전"),
                ExerciseAlarmDataClass("💌 10월 가계부가 도착했어요!","#당근 #당근가계부 #자원재순환 #따뜻한 거래","3일 전"),
                ExerciseAlarmDataClass("황졍민님, 동네생활에 댓글을 작성하셨네요!","더 많은 활동을 통해 '동네 활동가'에 도전해보세요.","3주전"),
                ExerciseAlarmDataClass("황졍민님, 동네생활 이웃에게 공감을 받으셨네요!","더 많은 활동을 통해 '동네 활동가'에 도전해보세요","4주전"),
                ExerciseAlarmDataClass("🎉황졍민님, 축하합니다! 동네 산책 배지를 획득했어요. 지금 확인해보세요."," ","5주전"),
                ExerciseAlarmDataClass("황졍민님, 동네생활에 글을 작성하셨네요!","더 많은 활동을 통해 '동네 활동가'에 도전해보세요.","6주전"),
                ExerciseAlarmDataClass("나눔을 실천하시는 황졍민님께 소식 도착🧡","10월은 나눔의 날, 쌀쌀해진 날을 따뜻하게 만든 나눔 사연을 전해요","7주전"),
                ExerciseAlarmDataClass("\uD83D\uDC8C9월 가계부가 도착했어요!","#당근 #당근가계부 #자원재순환 #따뜻한 거래","8주전")
            )
        )
    }

    private fun initExerciseRecyclerView() {
        exerciseAdapter = ExerciseAlarmAdapter(exerciseList)
        binding.rvExerciseAlarm.adapter = exerciseAdapter
        binding.rvExerciseAlarm.layoutManager = LinearLayoutManager(requireContext(),
            LinearLayoutManager.VERTICAL, false)
    }

}