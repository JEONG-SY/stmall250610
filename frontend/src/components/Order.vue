<template>
    <div>
        <String
            label="CustormerId"
            v-model="value.custormerId"
            :editMode="editMode"
        />
        <String
            label="ItemId"
            v-model="value.itemId"
            :editMode="editMode"
        />
        <Number
            label="Qty"
            v-model="value.qty"
            :editMode="editMode"
        />
        <String
            label="Address"
            v-model="value.address"
            :editMode="editMode"
        />
        <String
            label="Status"
            v-model="value.status"
            :editMode="editMode"
        />
        <v-row class="ma-0 pa-0">
            <v-spacer></v-spacer>
            <v-btn width="64px" color="primary" @click="save">
                저장
            </v-btn>
        </v-row>
    </div>
</template>


<script>
import BaseEntity from './base-ui/BaseEntity.vue'

export default {
    name: 'Order',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "orders",
        value: {
        }
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>
