package com.example.hom7and8mon5.History

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hom24mon5.databinding.HistoryItemBinding
import com.example.hom7and8mon5.remote.LoveModel

class HistoryAdapter(): RecyclerView.Adapter<HistoryAdapter.HistoryViewHolder>() {
    var models = arrayListOf<LoveModel>()
    fun loveAdd(list: List<LoveModel>){
        models.clear()
        models.addAll(list)
        notifyDataSetChanged()

    }

    inner class  HistoryViewHolder(private val binding: HistoryItemBinding):
        RecyclerView.ViewHolder(binding.root){
        fun bind(loveModel: LoveModel) {
            with(binding){
                meText.text = loveModel.firstName
                youText.text = loveModel.secondName
                precentage.text = loveModel.percentage
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {
        return HistoryViewHolder(HistoryItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return models.size
    }

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {
        holder.bind(models[position])
    }
}